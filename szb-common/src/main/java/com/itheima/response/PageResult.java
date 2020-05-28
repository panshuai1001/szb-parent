package com.itheima.response;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果数据封装类
 * Created by lenovo on 2020/5/23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult implements Serializable{
    private Integer rows;
    private Integer pages;
    private List<?> list;
}
