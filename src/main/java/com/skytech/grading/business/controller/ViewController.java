package com.skytech.grading.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname ViewController
 * @Description TODO
 * @Date 2019/4/29 22:47
 * @Created by huangdasheng
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String toIndex(){
        return "forward:login.html";
    }

}
