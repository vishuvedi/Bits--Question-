package com.company;
import java.util.Random;
import java.util.Scanner;
class guess
{
   private int Systeminput;
    private int userinput;
    public void System(int n)
    {
        Systeminput = n;
    }
    public int get()
    {
       return Systeminput;
    }

    public void gamealgo(int n,int a){

        if(n==a)
        {
            System.out.println("Horray you guessed the number :) and with " );
System.exit(0);
        }
        else if(n>a)
        {
            System.out.println("your target is more than your choice  ");

        }
        else if(n<a)
        {
            System.out.print(" your target is less than your choice ");
        }
    }
}
public class guessnumber {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rm = new Random();
guess vishu = new guess();
vishu.System(rm.nextInt(100));

 while(true)
 {
int userinout;
int m;

m = sc.nextInt();
vishu.gamealgo(vishu.get(),m );
 }
    }
}
