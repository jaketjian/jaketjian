package cn.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @RequestMapping("/test")
    public ModelAndView gotoTest(){
        ModelAndView mv=new ModelAndView();
        String init="你好，欢迎来到德莱联盟";
        mv.setViewName("");
        return mv;
    }
}
