package com.company;
import java.util.Scanner;
public class factorial {
    public static void factorial(int a,int ans)
    {
        if(a==0)
        {
            System.out.println(ans);
            return;
        }
        else
        {
            ans=ans*a;
            factorial(a-1,ans);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        factorial(n,1);
    }
}
