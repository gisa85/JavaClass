package org.dimigo.inheritance;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("냠냠");

    }

    public void sleep() {
        System.out.println("culcul");
    }

    public void bark() {
        System.out.println("mungmung");
    }

   public String toString(){
        return "제이름은" + name + "입니다";
    }
}
