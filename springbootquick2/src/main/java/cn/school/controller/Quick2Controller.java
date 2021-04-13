package cn.school.controller;

import cn.school.domain.Girl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ConfigurationProperties(prefix = "person")
public class Quick2Controller {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    private String adr;
 /*   @Value("${girl}")
    private List<Girl> girls;*/
    @RequestMapping("/quick2")
    public String quick2(){
        return "name:"+name+","+"addr:"+adr+"girl"/*+girls*/;
    }
}
