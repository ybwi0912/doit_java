package org.example.chapter3;

public class OperationEx4 {
    public static void main(String[] args) {
        int fatherAge = 45;
        int motherAge = 47;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';

        System.out.println("ch = " + ch); // F
    }
}
