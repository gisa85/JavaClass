package org.dimigo.oop2;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("제네시스 G90"),
                new Car("펠리세이드"),
                new Car("그랜저")
        };

        //cars[0].setCompany("기아");

        for(Car value : cars){
            System.out.println(value);
        }

        System.out.println(Integer.parseInt("1234"));
        System.out.println(Math.sin(Math.toRadians(30)));
    }
}
