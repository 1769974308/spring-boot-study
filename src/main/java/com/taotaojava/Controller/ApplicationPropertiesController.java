package com.taotaojava.Controller;

import com.taotaojava.properties.ApplicationProperties;
import com.taotaojava.properties.CustomConfigProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019\2\24 0024.
 */
@RestController
@RequestMapping("/properties")
public class ApplicationPropertiesController {

    private static  final Logger log = LoggerFactory.getLogger(ApplicationPropertiesController.class);

    private  final ApplicationProperties applicationProperties;

    private  final CustomConfigProperties customConfigProperties;

    @Autowired
    public  ApplicationPropertiesController(ApplicationProperties applicationProperties,CustomConfigProperties customConfigProperties){
        this.applicationProperties = applicationProperties;
        this.customConfigProperties = customConfigProperties;
    }

    @GetMapping("/getProperties")
    public  ApplicationProperties getProperties(){

        log.info("===============");
        log.info(applicationProperties.toString());
        log.info("================");


        return  applicationProperties;
    }

    @GetMapping("/getCustomConfigProperties")
    public CustomConfigProperties getCustomConfigProperties(){

        log.info("===============");
        log.info(customConfigProperties.toString());
        log.info("================");
        return  customConfigProperties;
    }

}
