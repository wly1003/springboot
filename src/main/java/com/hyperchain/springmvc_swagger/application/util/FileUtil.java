package com.hyperchain.springmvc_swagger.application.util;

import com.hyperchain.springmvc_swagger.application.constant.FileUploadEnum;
import com.hyperchain.springmvc_swagger.application.constant.SiteConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

@Component
public class FileUtil {
    @Autowired
    SiteConfig siteConfig;

    public String uploadFile(MultipartFile file, FileUploadEnum fileUploadEnum) throws IOException {
        if (!file.isEmpty()) {
            String originalFilename = file.getOriginalFilename();
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            String fileName = originalFilename.substring(0,originalFilename.lastIndexOf("."));
            String name = UUID.randomUUID()+suffix;
            BufferedOutputStream stream = null;
            String requestPath = null;

            if (fileUploadEnum == FileUploadEnum.FILE) {
                String today = DateUtil.dateToString(new Date(),DateUtil.Format_Year_To_Day);
                String userUploadPath = fileName+ File.separator+today+File.separator;
                File file_dir = new File(siteConfig.getLocalUploadPath()+userUploadPath);
                if (!file_dir.exists()){
                    file_dir.mkdirs();
                }
                stream = new BufferedOutputStream(new FileOutputStream(new File(siteConfig.getLocalUploadPath()+userUploadPath+name)));
                requestPath = siteConfig.getLocalUploadPath() + userUploadPath;
            }

            if (stream != null) {
                stream.write(file.getBytes());
                stream.close();
                return requestPath+originalFilename;
            }
        }
        return null;
    }
}
