package org.example.chapter5.hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이상원");

        System.out.println(studentLee.getStudentName());
    }
}
