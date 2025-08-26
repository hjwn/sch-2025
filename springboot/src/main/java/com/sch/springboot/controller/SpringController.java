package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {

    @ResponseBody           // String 문자열을 html의 body 부분에 바로 전달
    @GetMapping("/spring-api")
    public String springApi(@ModelAttribute Member member){
        System.out.println(member.getName());
        System.out.println(member.getAge());

        return member.toString();      // String 문자열을 전송
    }


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
