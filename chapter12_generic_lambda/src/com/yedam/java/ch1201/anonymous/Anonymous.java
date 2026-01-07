package com.yedam.java.ch1201.anonymous;

public class Anonymous {

    // 필드 익명 객체
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    // 메소드
    void method1() {
        // 로컬 변수 익명 객체
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("오디오를 끕니다.");
            }
        };

        // ✅ 메소드 안에서 호출
        localVar.turnOn();
    }
    void method2(RemoteControl rc) {
        rc.turnOn();
    }
    
}