package org.example.chapter5.constructor;

public class Person {
    String name;
    float height;
    float weight;

    public Person(){} // 디폴트 생성자 직접 추가

    public Person(String pname){
        name = pname;
    }

    public Person(String pName, float pheight, float pweight){
        name = pName;
        height = pheight;
        weight = pweight;
    }
}
