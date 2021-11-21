package com.company;
import java.util.Scanner;
public class recsum {

    public static void recursionsum(int a,int sum,int i) {
        if (a == i) {
            System.out.println(sum+a);
            return;
        } else {
            sum=sum+i;
            recursionsum(a, sum, i + 1);
        }

    }
        public static void main (String[]args){
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            recursionsum(n, 0, 1);
        }
    }
