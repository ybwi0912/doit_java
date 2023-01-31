package org.example.chapter11.string;

public class StringTest1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1==str2);
        // 인스턴스가 각각 따로 생성됨
        System.out.println(str1.equals(str2));
        // 문자열 값 자체는 같다

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);
        // 문자열 abc는 상수 풀에 저장되어 있기 때문에 두 문자열이 가리키는 주소 값이 같다
        System.out.println(str3.equals(str4));
        // 문자열 값 자체는 같다
    }
}
