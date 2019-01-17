package com.hyperchain.springmvc_swagger.application.controller;

import com.hyperchain.springmvc_swagger.application.constant.FileUploadEnum;
import com.hyperchain.springmvc_swagger.application.util.FileUtil;
import com.hyperchain.springmvc_swagger.business.constant.Code;
import com.hyperchain.springmvc_swagger.business.response.BaseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/v1/file")
@Api(value = "文件上传",description = "文件上传接口",position = 9)
@Slf4j
public class FileController {
    @Autowired
    FileUtil fileUtil;

    @ApiOperation(value = "上传文件",notes = "上传文件")
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    BaseResult index(MultipartFile multiPartFile) throws IOException {
        BaseResult baseResult = new BaseResult();
        String path = fileUtil.uploadFile(multiPartFile,FileUploadEnum.FILE);
        baseResult.returnWithValue(Code.SUCCESS,path);
        return baseResult;
    }
}
