package org.example;

class Solution1 {
    public static int mySqrt(int orig) {
        long temp = orig;
        while (temp * temp > orig)
            temp = (temp + orig / temp) / 2;
        return (int) temp;
    }

    public static void main(String[] args) {
        mySqrt(8);
    }
}