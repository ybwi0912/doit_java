package org.example.chapter3;

public class OperationEx1 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;
        int korScore = 65;

        int totalScore = mathScore + engScore + korScore;
        System.out.println("totalScore = " + totalScore);

        double avgScore = totalScore / 3.0;
        System.out.println("avgScore = " + avgScore);
    }
}
