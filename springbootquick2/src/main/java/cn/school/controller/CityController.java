package cn.school.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ConfigurationProperties(prefix = "cities")
public class CityController {
    private List<String> city;


    @Override
    public String toString() {
        return "CityController{" +
                "city=" + city +
                '}';
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    @RequestMapping("city")
    public String city(){
        return "city:::"+city;
    }
}
