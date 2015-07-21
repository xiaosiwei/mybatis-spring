package com.meituan.xiaosiwei.MSTest.controller;

import com.meituan.xiaosiwei.MSTest.domain.LoginMessage;
import com.meituan.xiaosiwei.MSTest.domain.UserDO;
import com.meituan.xiaosiwei.MSTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xiaosiwei on 15/7/20.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(){
        //返回一个逻辑视图，将由视图解析器解析为一个具体的视图对象，将被映射为/WEB-INF/views/user/register.jsp
        return "user/register";
    }

    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }

    //value值还支持Ant风格的如/user/**/register
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(LoginMessage loginMessage){
        UserDO userDO = userService.getUser(loginMessage);
        ModelAndView mav = new ModelAndView();
        //这一段逻辑应该在Service层写还是在这里???????
        if(userDO != null) {
            mav.setViewName("user/loginSuccess");
            mav.addObject("user",userDO);
        }else{
            mav.setViewName("user/loginFail");
        }
        return mav;
    }

    //处理/user的POST请求
    @RequestMapping(value = "/register",method=RequestMethod.POST)
    //将表单映射到User对象中，调用UserService保存对象，返回ModelAndView
    //请求参数按名称匹配的方式绑定到userDO的属性中，支持级联的属性名
    public ModelAndView createUser(UserDO userDO){
        userService.createUser(userDO);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user/createSuccess");
        mav.addObject("user",userDO);
        return mav;
    }
}
