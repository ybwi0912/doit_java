package org.example.chapter11.object;

class Student{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString(){
        return studentId + "," + studentName;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee; // 주소 복사
        Student studentSang = new Student(100, "이상원");

        if (studentLee == studentLee2){
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        }
        else {
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
        }
    }
}
