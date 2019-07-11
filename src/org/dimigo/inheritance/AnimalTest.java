package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        Dog d = new Dog("백구");
        Cat c = new Cat("떼껄룩");
        Tiger t = new Tiger("백호");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        System.out.println(d);
        d.wag();
        d.bark();
        d.sleep();

        System.out.println(c);
        c.bark();
        c.scratch();
        c.eat();
        c.sleep();

        System.out.println(t);
        t.bark();
        t.hunt();
        t.eat();
        t.sleep();


        Animal d2 = new Dog("멍멍이2");
        Animal c2 = new Cat("야옹이2");
        Animal t2 = new Tiger("호돌이2");

        d2.bark();
        c2.bark();
        t2.bark();

        Animal[] animals ={
                new Dog("멍멍이"),
                new Cat("멍멍이"),
                new Tiger("멍멍이"),

        };
        for(Animal animal: animals) {
            doBark(animal);
        }



        Animal a2 = new Dog("야용");
        //a2.scratch();

        Cat c3=(Cat)a2;
        c3.scratch();

        ((Cat)a2).scratch();

    }
    private static void doBark(Animal animal){
        if(animal instanceof  Cat) {
            Cat c = (Cat) animal;
            c.scratch();
        } else if(animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.wag();
        }
    }
}
