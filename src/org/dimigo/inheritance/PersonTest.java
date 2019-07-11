package org.dimigo.inheritance;

public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person("아이유",26,162,48);
        System.out.println(p1);
        p1.eat();
        p1.sleep();

        Student s= new Student("김한샘",18,162,70,"2509");
        System.out.println(s);
        s.eat();
        s.sleep();
        s.rollcall();
        s.studyAtNing();

        Teacher t = new Teacher(" 박성수",30,190,65,"정보통신");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.doTask();
        t.teach();


    }

}
