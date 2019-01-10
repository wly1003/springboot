package com.hyperchain.springmvc_swagger.application.controller;

import com.hyperchain.springmvc_swagger.application.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")
public class SpecController {
    private User user;
    @ApiOperation(value="授权登录",notes="授权登录")
    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Long")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        user.setId(id);
        return user;
    }
}
