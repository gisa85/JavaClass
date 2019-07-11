package org.dimigo.oop;

public class Calculator2 {
    // 정적 필드
    public static double PI = 3.1415926535897932384626;
    public boolean powerFlag;

    // 인스턴스 메소드.
    public void powerOn(){
        if(powerFlag ==false) {
            System.out.println("전원을 켭니다.");
            powerFlag=true;
        }
    }

    public void powerOff(){
        System.out.println("전원을 끕니다.");
        powerFlag = false;
    }

    // 정적 메소드드
    public static int add(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 + num2;
    }

    public static int sub(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 - num2;
    }

    public static int mul(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 * num2;
    }

    public static double div(int num1, int num2, Calculator2 c){
        c.powerOn();
        return (double)num1 / num2;
    }

}
