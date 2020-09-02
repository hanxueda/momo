package com.momo.contentcenter.domain.entity.content;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("abc表")
@Table(name = "content")
public class Content {
    /**
     * 主建id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("主建id")
    private Integer id;

    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private Integer uid;

    /**
     * 内容
     */
    @ApiModelProperty("内容")
    private Integer comment;
}