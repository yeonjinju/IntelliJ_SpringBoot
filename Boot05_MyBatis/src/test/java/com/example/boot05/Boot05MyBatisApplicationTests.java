package com.example.boot05;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class Boot05MyBatisApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(Boot05MyBatisApplication.class,args);

        // 크롬을 실행해서 http://localhost:9000/boot05 로딩하기
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("cmd /c start chrome.exe http://localhost:9000/boot05");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
