package com.company;

public class remo {

    public static void main(String[] args) {
        int a =2;
        int end = 20;
        int prod = 22;
while(a<end)
{
    if(prod%a== 0)
    {
        a++;
    }
    else
    {
        a=2;
        prod=prod+1;
    }
}
System.out.println(prod);

    }



}
