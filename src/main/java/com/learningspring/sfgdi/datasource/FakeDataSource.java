package com.learningspring.sfgdi.datasource;

/**
 * Created by jose- on 8/31/2021
 **/

public class FakeDataSource {

    private String userName;
    private String password;
    private String jdbcUrl;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
