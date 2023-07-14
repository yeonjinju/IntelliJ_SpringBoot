package com.example.boot04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request) {
        List<String> noticeList = new ArrayList<>();
        noticeList.add("Spring Boot 시작");
        noticeList.add("집에");
        noticeList.add("가고 싶다");

        request.setAttribute("noticeList", noticeList);

        return "home";
    }

    @GetMapping("/fortune")
    public ModelAndView fortune(ModelAndView mView) {
        // 오늘의 운세
        String fortuneToday = "동쪽으로 가면 귀인을 만나요";
        // ModelAndView 객체에 모델과 view page 의 정보를 담고
        mView.addObject("fortuneToday", fortuneToday);
        mView.setViewName("fortune");
        // 리턴
        return mView;
    }

    @GetMapping("/fortune2")
    public String fortune2(HttpServletRequest request) {
        // 오늘의 운세
        String fortuneToday = "동쪽으로 가면 귀인을 만나요";
        request.setAttribute("fortuneToday", fortuneToday);
        // 리턴
        return "fortune";
    }

}