package org.example.chapter3;

public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println("value = " + value);
        System.out.println("num1 = " + num1);
        System.out.println("i = " + i);

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println("value = " + value);
        System.out.println("num1 = " + num1);
        System.out.println("i = " + i);
        // 두 문장 다 첫 항으로 인해 두 번째 항이 실행되지 않았다. " 단락 회로 평가(SCE) "
    }
}
