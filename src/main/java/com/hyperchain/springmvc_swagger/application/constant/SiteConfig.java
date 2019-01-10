package com.hyperchain.springmvc_swagger.application.constant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data()
@Configuration
public class SiteConfig {
    @Value("${site.localUploadPath}")
    private String localUploadPath;

    @Value("${site.staticPath}")
    private String staticPath;

}
