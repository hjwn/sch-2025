package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    @ResponseBody
    @PostMapping("/member-api")
    public Member memberApi(@ModelAttribute Member member){
        return member;    // RestApi
    }

    @PostMapping("/member")
    public String memberPost(@ModelAttribute Member member, Model model){
        System.out.println("Post!");
        model.addAttribute("member", member);
        return "member";
    }

    @GetMapping("/member")
    public String member(@ModelAttribute Member member,
                         Model model){
        model.addAttribute("member", member);
        return "member";    // view name + model 객체
    }
}
