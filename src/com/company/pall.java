package com.company;

public class pall {
    public static void main(String[] args) {
        int a = 999;
        int b = 999;
        int c;
        while(b>=1)
       {
           c=a*(b);
           int prof = c;
            int rev = 0;
            while(c!=0) {
                int digit = c % 10;
                rev = rev * 10 + digit;
                c = c / 10;
            }
            if(prof==rev)
            {
                System.out.println(rev);
                break;
            }
b=b-1;
        }
    }
}
