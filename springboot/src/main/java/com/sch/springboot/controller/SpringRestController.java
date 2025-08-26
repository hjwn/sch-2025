package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController         // RestController 사용하면 @ResponseBody 생략 가능
public class SpringRestController {

    // @ResponseBody 생략 가능
    @GetMapping("/spring-Api")
    public Member springApi(){
        Member member = new Member();
        member.setName("홍길동");
        member.setAge(23);
        member.setAddress("서울시");
        member.setSubject("스프링부트");
        return member;        // 클라이언트에게 자바의 객체를 전송
    }
}