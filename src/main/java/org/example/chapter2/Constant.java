package org.example.chapter2;

public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100; // 상수 선언 및 초기화
        final int MIN_NUM;
        MIN_NUM = 0; // 사용 전에 초기화

        System.out.println("MIN_NUM = " + MIN_NUM);
        System.out.println("MAX_NUM = " + MAX_NUM);

    }
}
