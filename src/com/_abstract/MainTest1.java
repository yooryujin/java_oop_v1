package com._abstract;

public class MainTest1 {

    public static void main(String[] args) {
        // 객체 지향 개념으로 Animal 이라는 클래스를 인스턴스화 시키면 쫌 이상해!!
        Animal animal; // 타입으로 선언이 가능하다.
        // animal = new Animal();  <-- 오류 발생
        // Animal 클래스는 abstract 키워드를 붙여서 추상 클래스로 설계했다.
        // 그러면 추상 클래스는 new 란 키워드 생성자를 활용해서
        // 독립적으로 메모리에 올리수 없다.

        // Human human = new Human();
        // 개발자가 객체를 생성 시킬 때 다른 사용자가 마음대로 객체를 생성시키지 못
        // 하게 하는 강제성 지닐 수 있다.

    } // end of main
}
