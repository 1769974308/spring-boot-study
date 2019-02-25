package com.taotaojava.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019\2\24 0024.
 */

@Component
@PropertySource("classpath:customconfig.properties")
@ConfigurationProperties(prefix = "my")
public class CustomConfigProperties {

    private boolean test;

    private String environment;

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "CustomConfigProperties{" +
                "test=" + test +
                ", environment='" + environment + '\'' +
                '}';
    }
}


