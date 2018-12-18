package cn.itcast.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("GetUserName")
    public void GetUserName(){
        String name = SecurityContextHolder.getContext ().getAuthentication ().getName ();
        System.out.println (name);
    }
}
