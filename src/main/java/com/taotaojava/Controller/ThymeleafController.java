package com.taotaojava.Controller;

import com.taotaojava.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2019\2\25 0025.
 */
@RestController
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        view.setViewName("index");
        //设置属性
        view.addObject("title","thymeleaf模板");
        view.addObject("desc","hello world thymeleaf模板");
        User user = new User();
        user.setName("菜涛");
        user.setEmail("1769974308@qq.con");
        view.addObject("user",user);
        return  view;
    }

}
