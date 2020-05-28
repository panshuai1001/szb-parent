package com.itheima.product.controller;

import com.itheima.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2020/5/24.
 */
@RestController
@RequestMapping("/product")
@Api(description = "产品管理")
public class ProductController {

    @GetMapping
    @ApiOperation("查询测试")
    public Result find(){
        int a=1/0;
        return Result.ok("查询成功");
    }
}
