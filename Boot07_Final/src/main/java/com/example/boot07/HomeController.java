package com.example.boot07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request) {
        List<String> noticeList = new ArrayList<>();
        noticeList.add("Spring Boot 시작");
        noticeList.add("ㅎㅏ이요");
        noticeList.add("빠이팅");

        request.setAttribute("noticeList", noticeList);

        return "home";
    }


}
