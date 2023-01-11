package org.example.chapter2;

public class ImplicitConversion {
    public static void main(String[] args) {
        // 묵시적 형 변환(자동)
        byte bNum = 10;
        int iNum = bNum;

        System.out.println("iNum = " + iNum);
        System.out.println("bNum = " + bNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println("iNum = " + iNum);
        System.out.println("fNum = " + fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println("dNum = " + dNum); // float형이 된다
    }
}
