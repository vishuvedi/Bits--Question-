package com.company;
import java.util.Scanner;
import  java.util.Arrays;
public class ksmall {
    public static void main(String[] args) {
        int[] arr = {2,56,1,8,9,4};
        Scanner sc = new Scanner(System.in);
        int k;
        k  = sc.nextInt();

         int min = arr[0];
         int n =0;
         int i;
         Arrays.stream(arr).sorted();
         System.out.println(arr[k]);



    }
}
