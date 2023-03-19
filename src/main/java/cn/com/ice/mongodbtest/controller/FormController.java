package cn.com.ice.mongodbtest.controller;

import cn.com.ice.mongodbtest.config.FormConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/form")
    public FormConfig getFormConfig() {
        return mongoTemplate.findOne(null, FormConfig.class);
    }
}