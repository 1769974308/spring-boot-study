package com.taotaojava.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019\2\24 0024.
 */

@Component
@ConfigurationProperties(prefix = "my")
public class ApplicationProperties {

    private  String project;

    private  String version;

    private  String describe;


    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "ApplicationProperties{" +
                "project='" + project + '\'' +
                ", version='" + version + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
