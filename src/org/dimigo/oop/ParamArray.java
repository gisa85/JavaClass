package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        add(intArr, 10);
        printArray(intArr);
        System.out.println();

        String[] names = {"홍길동", "홍길서", "홍길남", "홍길북", "홍길홍", "홍준표", "홍재인", "홍영삼", "홍대중"};
        changeName(names, "김");
        printArray(names);
    }

    private static void printArray(String[] names) {
        for(String value:names){
            System.out.println(value);
        }
    }

    private static void changeName(String[] names, String root) {
        for(int i = 0; i<names.length; i++) {
            // names[i] = root+names[i].substring(1);   //이거나
            names[i] = names[i].replaceFirst("홍", root);    //이거가 좋음
            // names[i] = names[i].replace('홍', '김');   // 이건 다 바뀝니다.
        }
    }

    private static void add(int[] intArr, int amount){
        for (int i = 0; i<intArr.length; i++) {
            intArr[i]+=amount;
        }
    }

    private static void printArray(int[] intArr) {
        for(int value:intArr) {
            System.out.print(value + "|");
        }
    }
}
