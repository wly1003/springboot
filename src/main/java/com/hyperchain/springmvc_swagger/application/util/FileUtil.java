package com.hyperchain.springmvc_swagger.application.util;

import com.hyperchain.springmvc_swagger.application.constant.FileUploadEnum;
import com.hyperchain.springmvc_swagger.application.constant.SiteConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Component
public class FileUtil {
    @Autowired
    SiteConfig siteConfig;

    public String uploadFile(MultipartFile file, FileUploadEnum fileUploadEnum,String userName) throws IOException {
        if (!file.isEmpty()) {
            String type = file.getContentType();
            System.out.print("type"+type);
            String suffix = "." + type.split("/")[1];
            String fileName = null;
        }
        return null;
    }
}
