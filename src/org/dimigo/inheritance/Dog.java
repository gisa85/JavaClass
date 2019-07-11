package org.dimigo.inheritance;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }


    public void wag() {
        System.out.println("꼬리를 흔든다" );
    }

    //DOG애만 있는 메소드 추가


}
