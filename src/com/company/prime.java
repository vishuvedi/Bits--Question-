package com.company;

public class prime {
    public static void main(String[] args) {

        long n = 60085147;
        int i;
        for(i=1 ; i<n;i++)
        {
            if(n%i==0 && (i%2!=0) && (i%3!=0)){
                System.out.println(i);
            }
        }
    }
}
