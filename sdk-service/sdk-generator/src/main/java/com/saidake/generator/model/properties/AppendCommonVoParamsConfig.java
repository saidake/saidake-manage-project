package com.saidake.generator.model.properties;

import lombok.Data;

@Data
public class AppendCommonVoParamsConfig {
    private String commonVoPackage;
    private String template;
    private String suffix;
    private String writeMode;

    private String replaceName;
    private String replaceComment;

}