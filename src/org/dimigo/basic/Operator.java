package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        // 1. 산술연산자
        int a = 5, b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // 2.5가 나오게 하려면?
        System.out.println((double)a/b);

        // 0으로 나누기
//        System.out.println(a/0);  ->  에러

        int i = 10;
        double d = 3.14;
        int r1 = (int)(i + d);
        double r2 = i+d;

        short s1 = 1, s2 = 2;
        short r3 = (short)(s1 + s2);
        int r4 = s1 + s2;

        // Short-Circuit 테스트
        boolean flag = true;
        a = 10;
        b = 0;

        if (flag || (a/b == 0)) {
            System.out.println("OR 연산");
        }

        if (!flag && (a/b == 0)) {
            System.out.println("AND 연산");
        }

        // 문자열 연결 연산자
        String school = "dimigo";
        int grade = 2;
        int ban = 5;
        String name = "륶성뫼";

        System.out.println(school + grade + ban + name);
        System.out.println(grade + ban + school + name);

        // 25dimigo륶성뫼 출력하기
        System.out.println(grade+(ban+school)+name);
        System.out.println(""+grade+ban+school+name);
    }
}
