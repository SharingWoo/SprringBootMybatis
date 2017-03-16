package com.example.config;

import com.example.util.MapperLocations;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by SharingWoo on 2017/3/15.
 */
@Configuration
@MapperScan(basePackages = {"com.example.mapper"}, sqlSessionFactoryRef = "bsSqlSessionFactory")
public class BSDataSourceConfig {
    private Logger logger = LoggerFactory.getLogger(BSDataSourceConfig.class);

    @Value("${bs.jdbc.type}")
    private String bsJdbcType;

    @Bean
    @ConfigurationProperties(prefix = "bs.jdbc")
    public DataSource bsDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public SqlSessionFactory bsSqlSessionFactory(@Qualifier("bsDataSource") DataSource bsDataSource, List<MapperLocations> mapperLocationsList) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(bsDataSource);

        logger.info("bsJdbcType:" + bsJdbcType);

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = {};
        for (MapperLocations mapperLocations : mapperLocationsList) {
            String[] locations = mapperLocations.getLocations(MapperLocations.Type.BS);
            if (ArrayUtils.isNotEmpty(locations)) {
                for (String location : locations) {
                    resources = ArrayUtils.addAll(resources, resolver.getResources(location));
                }
            }
        }
        bean.setMapperLocations(resources);

        SqlSessionFactory sqlSessionFactory = bean.getObject();
        sqlSessionFactory.getConfiguration().setDefaultStatementTimeout(30);
        return sqlSessionFactory;
    }

    @Bean
    public MapperLocations dsLocations(@Value("${bs.jdbc.type}") String jdbcType) {
        return new MapperLocations(MapperLocations.Type.BS, "classpath*:" + jdbcType + "/com/example/ds/sqlmap/*Mapper.xml");
    }

    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("bsDataSource") DataSource bsDataSource) {
        return new JdbcTemplate(bsDataSource);
    }

    @Bean
    public PlatformTransactionManager bsTransactionManager(@Qualifier("bsDataSource") DataSource bsDataSource) {
        return new DataSourceTransactionManager(bsDataSource);
    }
}
