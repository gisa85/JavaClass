package org.dimigo.oop;

import java.awt.*;

public class WrapperTest {
    public static void main(String[] args) {
        // Wrapper 클래스 : Primitive Type를 Wrapping하는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

        // Boxing
        Integer i1 = new Integer(100);  // 생성자
        Integer i2 = new Integer("100");

        System.out.println(i1.equals(i2));

        // 2) valueOf()
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Double d1 = Double.valueOf("3.141592");

        // Unboxing
        int r1 = i3.intValue();
        double r2 = d1.intValue();

        // 문자열 -> Primitive Type
        int a = Integer.parseInt("100");
        double b = Double.parseDouble("3.1415926535897932384626");

        // 실행시 전달인자
        int args0 = Integer.parseInt(args[0]);
        int args1 = Integer.parseInt(args[1]);
        System.out.println(args0 + args1);

        // 실험실
        Integer t1 = new Integer(1000);
        Integer t2 = new Integer(2000);
        Integer result = t1 + t2;
        System.out.println(result);

        Integer obj1 = 1000;
        System.out.println(obj1);

        Integer obj2 = 10; // boxing
        Integer obj3 = obj2 + 20;   //boxing unboxing
        Integer result2 = obj2+obj3; // unboxing unboxing boxing
    }
}
