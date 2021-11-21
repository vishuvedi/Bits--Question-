package com.company;
import  java.util.Scanner;
public class power {
    public static int power(int a,int value)
    {
      if(a==1)
      {
          return value;
      }
      else
      {
          value = value*power(a-1,value);
          return value;
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int value;
        value = sc.nextInt();
       int ans;
       ans = power(a,value);
System.out.println(ans);

    }
}
