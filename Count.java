package com;

public class Count {

    public static int CountDigits(int n){
        int cnt =0;
        while (n>0) {
            cnt = cnt + 1;
            n = n / 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
       int n = 344;
       int Countnum = CountDigits(n);
       System.out.println(Countnum);
    }
}
