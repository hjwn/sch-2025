package com.sch.springboot.repository;

import com.sch.springboot.dto.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    /*
        login : 로그인 처리
     */
    public Map<String, Object> login(User user) {
        String did = "test";
        String dpass = "1234";
        Map<String, Object> result = new HashMap<>();

        if(user.getId().equals(did) && user.getPass().equals(dpass)){
            result.put("status","success");
            result.put("message","로그인 성공");
            result.put("id",user.getId());
        } else {
            result.put("status","fail");
            result.put("message","로그인 실패");
            result.put("id",user.getId());
        }
        return result;
    }

    /*
        signup : 회원가입 처리
     */
    public Map<String, String> signUp(User user){
        Map<String, String> map = new HashMap<>();
        map.put("id",user.getId());
        map.put("pass",user.getPass());
        map.put("name",user.getName());
        map.put("email", user.getEmail());
        return map;
    }
}
