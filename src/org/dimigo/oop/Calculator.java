package org.dimigo.oop;

public class Calculator {
    // 인스턴스 필드 - static이 없다...
    private int num1;
    private int num2;
    private boolean powerFlag;

    // 인스턴스 메소드 - 스태틱이 업따.. 꼭 객체를 만들어야 쓸 수 있다.
    public Calculator(){
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void powerOn(){
        if(powerFlag ==false) {
            System.out.println("전원을 켭니다.");
            this.powerFlag=true;
        }
    }

    public void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    public int add(){
        System.out.println(this);
        this.powerOn();
        return this.num1 + this.num2;
    }

    public int sub(){
        this.powerOn();
        return this.num1 - this.num2;
    }

    public int mul() {
        this.powerOn();
        return this.num1 * this.num2;
    }

    public double div(){
        this.powerOn();
        return (double)this.num1 / this.num2;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator(10, 20);
        System.out.println(c.num1);
        System.out.println(c.num2);
        c.powerOn();
    }
}
