package com.company;
import java.util.Scanner;
public class imouse {
    public static void main(String[] args) {
        int n;
         Scanner sc = new Scanner(System.in);
         int k = sc.nextInt();
         String s1 = Integer.toBinaryString(k);
         int m = Integer.parseInt(s1);
         while(m>0)
         {
             m=m%10;

         }
    }
}
