package org.example.chapter8.inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer(){
        customerGrade = "VIP"; // 상위 클래스에서 private 변수라 오류 발생
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID(){
        return agentID;
    }
}
