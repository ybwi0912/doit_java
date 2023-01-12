package org.example.chapter5.constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person personLee = new Person(); // 생성자
        personLee.name = "이순신";
        personLee.weight = 85.5F;
        personLee.height = 180.0F;

        Person personKim = new Person("김유신", 175, 75);
    }
}
