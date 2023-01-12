package com.lin.web;

import cn.hutool.http.HttpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/http")
    public String hello() {
        // 使用http访问 provider 的 hello 接口
        String result = HttpUtil.get("http://http-provider/hello");
        return "从provider中接收到：" + result;
    }
}
