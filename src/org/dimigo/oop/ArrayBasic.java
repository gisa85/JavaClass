package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형 : int, long, double, char, float, boolean, short
        // 참조형 : String, Book, Car, Scanner, Random, StringBuilder
        Book book = null;
        Car car = null;

        int[] intArr = null;
        intArr = new int[5];

        printArray(intArr);

        // double 타입 배열 생성 후 출력
        double[] doubleArr = null;
        doubleArr = new double[5];

        printArray(doubleArr);

        // 배열 선언 시 초기화
        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr3 = new int[]{1, 2, 3, 4, 5};

        printArray(intArr2);

        // 참조형 배열
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "BTS";
        strArr[1] = "EXO";
        strArr[2] = "볼빨간 사춘기";
        // strArr[3] = "TEST";
        printArray(strArr);

        String[] strArr2 = {"BTS", "EXO", "TWICE"};
        String[] strArr3 = new String[]{"BTS", "EXO", "TWICE"};
        printArray(strArr2);

        //Book 타입 2개짜리 배열 생성
        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블", "김재영", 100);
        bookArr[1] = new Book("워드마스터", "전유원", 300);
        printArray(bookArr);

        Book[] bookArr2 = {
                new Book("수학의 바이블", "김재영", 100),
                new Book("워드마스터", "전유원", 300)
        };
        printArray(bookArr2);

        // 배열 사용시 주의사항
        int[] intArr4 = new int[3];
        System.out.println(intArr4[intArr4.length-1]);

        String[] strArr4 = new String[3];
        System.out.println(strArr4[0]);

        Book[] bookArr3 = new Book[3];

        // 선언
        String[] strArr5 = null;
        // strArr5 = {"ㅎㅅ", "ㄱㅂ"};
        strArr5 = new String[] {"ㅎㅅ", "ㄱㅂ"};


    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr){
            System.out.println(value);
        }
    }

    private static void printArray(double[] doubleArr) {
        for(double value : doubleArr){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] intArr) {
        for(int value : intArr){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] strArr) {
        for(String value : strArr){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
