package com.company;
import  java.util.Scanner;
public class fibnacci {
   public static void  fibnacci(int a, int i, int s, int l,int ans)
    {
        if(a==i)
        {

            return;
        }
        else
        {
            i=i+1;
            ans=s+l;
            s=l;
            l=ans;
            fibnacci(a,i,s,l,ans);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        fibnacci(n,0,0,1,1);
    }
}
