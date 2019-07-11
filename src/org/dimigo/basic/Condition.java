package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        // 1. if~else
        // 선거권 연령 : 20세부터 (만 19세)
        int age = 17;

        // 19세 이상이면 "투표하러 가세요"
        // 아니면 "선거권이 없네요" 출력

        if (age >= 19){
            System.out.println("투표하러 가세요");
        }
        else {
            System.out.println("선거권이 없네요");
        }

        // 2.switch
        // 주사위 랜덤 뽑기 (1~6)
        int num = new Random().nextInt(6)+1;
        System.out.println(num);

        switch (num%2){
            case 1:
                System.out.println("홀수입니다.");
                break;
            case 0:
                System.out.println("짝수입니다.");
                break;
        }

        String menu = "치칵치칵";

        switch (menu){
            case "치칵치칵":
                System.out.println("아 나도 "+menu+"가고싶어~");
                break;
            case "순대":
                System.out.println(menu+"는 좀 별루....");
                break;
        }
    }
}
