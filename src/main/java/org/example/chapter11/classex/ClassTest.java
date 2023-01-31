package org.example.chapter11.classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException{
        Person person = new Person();
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class; // 직접 class 파일 대입
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("org.example.chapter11.classex.Person");
        System.out.println(pClass3.getName());
    }
}
