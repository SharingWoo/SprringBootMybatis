package com.example.config;

import com.example.util.MapperLocations;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by SharingWoo on 2017/3/16.
 */
@Configuration
@MapperScan(basePackages = {"com.example.mapper.sharing"}, sqlSessionFactoryRef = "sharingSqlSessionFactory")
public class SharingDataSourceConfig {

    private Logger logger = LoggerFactory.getLogger(SharingDataSourceConfig.class);

    @Value("${sharing.jdbc.type}")
    private String sharingJdbcType;

    @Bean
    @ConfigurationProperties(prefix = "sharing.jdbc")
    public DataSource sharingDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sharingSqlSessionFactory")
    public SqlSessionFactory sharingSqlSessionFactory(@Qualifier("sharingDataSource") DataSource sharingDataSource, List<MapperLocations> mapperLocationsList) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(sharingDataSource);
        logger.info("sharingJdbcType:" + sharingJdbcType);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = {};
        for (MapperLocations mapperLocations : mapperLocationsList) {
            String[] locations = mapperLocations.getLocations(MapperLocations.Type.SHARING);
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
    public MapperLocations sharingLocations(@Value("${sharing.jdbc.type}") String jdbcType) {
        return new MapperLocations("classpath*:" + jdbcType + "/com/example/sharing/sqlmap/*Mapper.xml");
    }

    @Bean
    public JdbcTemplate sharingJdbcTemplate(@Qualifier("sharingDataSource") DataSource sharingDataSource) {
        return new JdbcTemplate(sharingDataSource);
    }

    @Bean
    public PlatformTransactionManager sharingTransactionManager(@Qualifier("sharingDataSource") DataSource sharingDataSource) {
        return new DataSourceTransactionManager(sharingDataSource);
    }
}
