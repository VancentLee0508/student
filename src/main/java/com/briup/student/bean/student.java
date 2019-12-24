package com.briup.student.bean;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class student implements Serializable {

    @ApiModelProperty(value = "学生id")
    private int id;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "学生分数")
    private double score;


}
