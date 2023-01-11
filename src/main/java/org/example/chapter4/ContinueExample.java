package org.example.chapter4;

public class ContinueExample {
    public static void main(String[] args) {
        int total = 0;
        int num;

        for(num=1 ; num<=100 ; num++){
            if(num % 2 == 0)
                continue; // num이 짝수인 경우 이후 수행을 생략
            total += num;
        }
        System.out.println("total = " + total);
    }
}
