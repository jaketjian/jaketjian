/*
package cn.school.controller;
import cn.school.domain.xiyouji;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ConfigurationProperties(prefix = "books")
public class BookController {
    public List<cn.school.domain.xiyouji> getXiyouji() {
        return xiyouji;
    }

    public void setXiyouji(List<cn.school.domain.xiyouji> xiyouji) {
        this.xiyouji = xiyouji;
    }

    private List<xiyouji> xiyouji;
    @RequestMapping("/books")
    public String books(){
        return "西游记："+xiyouji;
    }
}
*/
