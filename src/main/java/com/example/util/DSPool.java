package com.example.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by SharingWoo on 2017/3/15.
 */
@ConfigurationProperties(prefix = "ds.jdbc")
public class DSPool {

    private String jdbcUrl;
    private String url;

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}