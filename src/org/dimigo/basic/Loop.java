package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 구구단
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }

        // 2. for-each 문
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        // ITZY 멤버 출력
        String[] idol = {"황예지", "이채령", "신류진", "신유나", "최지수"};

        for (String value : idol) {
            System.out.println(value);
        }

        // while, do~while문
        Scanner scanner = new Scanner(System.in);
        int menu=0;

        do {
            System.out.println("<< 간식 선택 >>");
            System.out.println("1. 치킨");
            System.out.println("2. 냉면");
            System.out.println("3. 피자");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 ==> ");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    System.out.println("치칵치칵으로 외출하기...");
                    break;
                case 2:
                    System.out.println("냉면집으로 외출하기");
                    break;
                case 3:
                    System.out.println("피자헉으로 외출하기");
                    break;
                case 9:
                    System.out.println("그럼 넌 아라마크야~");
                    scanner.close();
                    break;
                default:
                    System.out.println("뭘 먹고 싶은거니?");
                    break;
            }
        } while(menu != 9);
    }
}
