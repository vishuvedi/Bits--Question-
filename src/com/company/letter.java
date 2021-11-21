package com.company;
import  java.util.Scanner;
public class letter {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String m;
        System.out.println("whats your name ??");
        m= sc.nextLine();
        String s1 = "hey name I like you will you marry me ??";
        String m2 = s1.replace("name",m);
        System.out.println(m2);


    }
}
