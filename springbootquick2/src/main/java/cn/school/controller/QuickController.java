package cn.school.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class QuickController {
    @RequestMapping("/quick")
    public String quick(){
        ModelAndView mv =new ModelAndView();
        return "hello Nicetommetcontroller";
    }
}
