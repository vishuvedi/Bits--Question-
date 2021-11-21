package com.company;

public class logd {
    public static void main(String[] args) {
        int a;
        a = 6;
        String s1 ;
        s1 = Integer.toBinaryString(a);
        int count = 0;
        int n = Integer.parseInt(s1);
        while(n>0)
        {
            n=n>>1;
            count++;
        }
        System.out.println(count);

    }
}
