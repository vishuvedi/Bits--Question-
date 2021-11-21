package com.company;

public class jee {
    public static void main(String[] args) {
        int n = 8;
        int base = 1;
        int sum = 0;
        while(n>0)
        {
            int m = n&1;
            n=n>>1;
            sum = sum +( base*m);
            base = base*5;

        }
        System.out.println(sum);
    }
}
