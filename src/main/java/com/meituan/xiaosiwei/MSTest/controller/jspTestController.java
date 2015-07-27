package com.meituan.xiaosiwei.MSTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaosiwei on 15/7/27.
 */
@RequestMapping("/jsp")
public class jspTestController {

    @RequestMapping("/testform")
    public String testForm(){
        return "jsp/main";
    }
}
