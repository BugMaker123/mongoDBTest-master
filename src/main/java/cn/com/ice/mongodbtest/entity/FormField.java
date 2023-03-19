package cn.com.ice.mongodbtest.entity;

import lombok.Data;

@Data
public class FormField {
    private String label;

    private String type;

    private boolean required;
}
