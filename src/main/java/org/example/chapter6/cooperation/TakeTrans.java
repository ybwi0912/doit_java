package org.example.chapter6.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentKiwi = new Student("Kiwi", 5000);
        Student studentTomato = new Student("Tomato", 10000);

        Bus bus100 = new Bus(100);
        studentKiwi.takeBus(bus100);
        studentKiwi.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        studentTomato.takeSubway(subwayGreen);
        studentTomato.showInfo();
        subwayGreen.showInfo();
    }
}
