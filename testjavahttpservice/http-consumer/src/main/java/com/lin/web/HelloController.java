package com.lin.web;

import cn.hutool.http.HttpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// http-provider:8081
@RestController
public class HelloController {

    @GetMapping("/http/{address}")
    public String hello(@PathVariable String address) {
        // 使用http访问 provider 的 hello 接口
        return "从provider中接收到：" + HttpUtil.get(address + "/hello");
    }
}
