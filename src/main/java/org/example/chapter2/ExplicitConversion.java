package org.example.chapter2;

public class ExplicitConversion {
    public static void main(String[] args) {
        // 명시적 형 변환 (수동)
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2; // 형변환 후 더해짐
        int iNum4 = (int)(dNum1 + fNum2); // 더한 후 형변환
        System.out.println("iNum3 = " + iNum3); // 1
        System.out.println("iNum4 = " + iNum4); // 2
    }
}
