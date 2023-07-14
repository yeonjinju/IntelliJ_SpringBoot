package com.example.aop.util;

public class MemberDto {
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    private int num;
    private String name;
    private String addr;



    // 생성자
    public MemberDto() {}

    public MemberDto(int num) {
        this.num = num;
    }
}
