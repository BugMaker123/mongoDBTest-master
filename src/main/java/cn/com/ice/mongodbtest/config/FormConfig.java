package cn.com.ice.mongodbtest.config;

import cn.com.ice.mongodbtest.entity.FormField;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "form")
public class FormConfig {

    @Id
    private String id;

    private String title;

    private List<FormField> fields;

    // getters and setters
}