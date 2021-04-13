package cn.school.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Quick2Controller {
    @Value("${person.name}")
    private String name;
    @Value("${person.addr}")
    private String adr;
    @RequestMapping("/quick2")
    public String quick2(){
        return "name:"+name+","+"addr:"+adr;
    }
}
