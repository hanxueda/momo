package com.momo.usercenter.domain.dto.abc;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: hanxd
 * @Date: 2020-08-27 10:36
 */
@Data
public class AbcDto {

    /**
     * 主建id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("主建id")
    private Integer id;

    /**
     * 姓名
     */
    @ApiModelProperty("姓名")
    private Integer name;

    /**
     * 性别
     */
    @ApiModelProperty("性别")
    private Integer sex;

    /**
     * 地址
     */
    @ApiModelProperty("地址")
    private Integer address;

    /**
     * 是否删除
     */
    @ApiModelProperty("是否删除")
    private Integer isDel;
}
