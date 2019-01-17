package com.hyperchain.springmvc_swagger.application.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_rbac_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @ApiModelProperty("用户id")
    private Long id;

    @Column
    @ApiModelProperty("用户名")
    private String name;

    @Column
    @ApiModelProperty("密码")
    private String password;

    @Column
    @ApiModelProperty("真实姓名")
    private String realName;

    @Column
    @ApiModelProperty("组id")
    private String groupId;

    @Column
    @ApiModelProperty("最后一次登录时间")
    private Date lastLoginTime;

    @Column
    @ApiModelProperty("是否是有效用户")
    private String isValid;

    @Column
    @ApiModelProperty("备注")
    private String bz;
}
