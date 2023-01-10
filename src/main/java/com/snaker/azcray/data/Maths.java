package com.snaker.azcray.data;

public class Maths {
    public static int generateFactorial(int i) {
        if (i == 0) {
            return 1;
        } else {
            return (i * generateFactorial(i-1));
        }
    }
}