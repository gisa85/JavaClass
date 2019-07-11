package org.dimigo.oop2;

public class Car {
    // 정적 빌드
    private static String company;
    private String name;

    static {
        company = "현대자동차";
        System.out.println("static block called");
    }
    public Car(String name) {
        System.out.println("Constructor called");
        this.name = name;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return company + ":" + name;
    }

}
