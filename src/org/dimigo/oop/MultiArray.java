package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];
        printArray(intArr);

        intArr[0][1] = 100;
        intArr[1][2] = 90;
        printArray(intArr);

        String[][] strArr = new String[2][];
        strArr[0] = new String[3];
        strArr[1] = new String[2];

        strArr[0][0] = "C";
        strArr[0][1] = "C++";
        strArr[0][2] = "JAVA";
        strArr[1][0] = "PHP";
        strArr[1][1] = "C#";
        printArray(strArr);

        String[][] strArr2 = {
                {"C", "C++", "JAVA"},
                {"PHP", "C#"}
        };
        printArray(strArr2);

        String[][] strArr3 = {
                new String[]{"C", "C++", "JAVA"},
                new String[]{"PHP", "C#"}
        };

        String[][] strArr4 = new String[][]{
                {"C", "C++", "JAVA"},
                {"PHP", "C#"}
        };
    }

    private static void printArray(String[][] strArr) {
        for(String[] arr:strArr){
            for(String value:arr){
                System.out.print(value+"|");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] intArr){
        for(int[] arr:intArr){
            for(int value:arr){
                System.out.print(value + "|");
            }
            System.out.println();
        }
    }
}
