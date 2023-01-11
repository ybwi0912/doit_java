package org.example.chapter3;

public class OperationEx5 {
    public static void main(String[] args) {
        int num = 0B00000101; // 8비트 2진수로 나타낸 5

        System.out.println(num << 2);
        System.out.println(num >> 2);
        System.out.println(num >>> 2);

        System.out.println("num = " + num); // 5

        num = num << 2;
        System.out.println("num = " + num); // 20
    }
}
