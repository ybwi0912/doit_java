package org.example.chapter8.inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer(){
        // super(); 컴파일러가 자동으로 추가하는 코드. 상위 클래스의 Customer()가 호출된다.
        customerGrade = "VIP"; // 상위 클래스에서 private 변수라 오류 발생
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출 ");
    }

    public int getAgentID(){
        return agentID;
    }
}
