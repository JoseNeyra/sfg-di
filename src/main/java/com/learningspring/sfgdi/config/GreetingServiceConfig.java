package com.learningspring.sfgdi.config;

import com.learningspring.sfgdi.datasource.FakeDataSource;
import com.learningspring.sfgdi.services.ConstructorGreetingService;
import com.learningspring.sfgdi.services.PropertyInjectedGreetingService;
import com.learningspring.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by jose- on 8/30/2021
 **/

@PropertySource("classpath:datasource.properties")
@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

    @Bean
    FakeDataSource fakeDataSource(@Value("${guru.username}") String username,
                                  @Value("${guru.lastname}")String password,
                                  @Value("${guru.jdbcurl}")String jdbcurl) {

        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcUrl(jdbcurl);

        return fakeDataSource;
    }
}
