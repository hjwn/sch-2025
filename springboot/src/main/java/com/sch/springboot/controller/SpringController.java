package com.sch.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringController {

    @GetMapping("/spring")
    public String spring(@RequestParam("name") String name,
                         @RequestParam("age") int age,
                         Model model){
//        System.out.printf("%s\t%d\n",name, age);   //서버 콘솔에 출력
        // model 객체에 추가
        model.addAttribute("name",name);
        model.addAttribute("age", age);
        return "spring";    // view name
    }
}
