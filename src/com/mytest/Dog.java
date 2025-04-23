package com.mytest;

import com.dot.MainTest;

// class 클래스이름 extend 상위클래스 이름 implements 인터페이스 이름 { ... }
class Dog extends Ya implements Animal {

    public void cry() {
        System.out.println("멍멍");
    }


    public void name() {
        System.out.println("멍이");

    }
}
