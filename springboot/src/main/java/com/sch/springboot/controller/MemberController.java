package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MemberController {
    @GetMapping("/member")
    public String member(@ModelAttribute Member member,
                         Model model){
        model.addAttribute("member", member);
        return "member";    // view name + model 객체
    }
}
