package com.zhoulei.springmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**控制器*/
@Controller
@RequestMapping("/")
public class HomeController {

    /**动作，action*/
    @RequestMapping("")
    public String index(Model model){
        //向模型中添加属性msg与值，将与页面模板渲染后输出
        model.addAttribute("msg","Welcome my website!");
        return "hi";
    }

}
