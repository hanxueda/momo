package com.momo.usercenter.domain.entity.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "user")
public class User {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id")
    private Integer id;

    /**
     * 性名
     */
    @ApiModelProperty("性名")
    private String name;

    /**
     * 地址
     */
    @ApiModelProperty("地址")
    private String address;

    /**
     * email
     */
    @ApiModelProperty("email")
    private String email;

    /**
     * qq
     */
    @ApiModelProperty("qq")
    private String qq;
}