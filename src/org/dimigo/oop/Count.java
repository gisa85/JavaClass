package org.dimigo.oop;

public class Count {
    private static int count = 0;

    public Count(){
        count++;
    }

    public static int getCount(){
        return count;
    }
}
