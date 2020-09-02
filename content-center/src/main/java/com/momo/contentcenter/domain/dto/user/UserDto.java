package com.momo.contentcenter.domain.dto.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @Author: hanxd
 * @Date: 2020-09-02 08:24
 */
@Data
public class UserDto {

    /**
     * id
     */
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
