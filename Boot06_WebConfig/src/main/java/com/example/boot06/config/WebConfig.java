package com.example.boot06.config;

import com.example.boot06.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*
    [Spring MVC 관련설정]

    1. WebMvcConfigurer 인터페이스를 구현한다.
    2. 설정에 필요한 메소드만 오버라이딩 한다. 주로 Resource Handler, Interceptor, view page 관련 설정을 여기서 한다.
    3. 설정에 관련된 클래스에는 @Configuration 어노테이션을 붙여야한다.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    // LoginInterceptor DI
    @Autowired
    LoginInterceptor loginInterceptor;

    // Interceptor 를 추가할때 오버라이딩 하는 메소드
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 메소드의 인자로 전달되는 InterceptorRegistry 객체를 이용해서 Interceptor 를 등록해야 한다.
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/users/*")
                .excludePathPatterns("/users/loginform")
                .excludePathPatterns("/users/login"); // @Autowired 하고, () 안에 입터셉터의 컴포넌트 된 클래스명을 적는다.
    }

    // webapp/resources 폴더 설정
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}
