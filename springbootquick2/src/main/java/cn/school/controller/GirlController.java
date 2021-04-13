package cn.school.controller;

import cn.school.domain.Girl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ConfigurationProperties("girls")
public class GirlController {
    private List<Girl> girl;
    private String name;

    @Override
    public String toString() {
        return "GirlController{" +
                "girl=" + girl +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Girl> getGirl() {
        return girl;
    }

    public void setGirl(List<Girl> girl) {
        this.girl = girl;
    }

    @RequestMapping("/girl")
    public String girl(){
        System.out.println(girl);
        return "girl:"+girl;
    }

}
