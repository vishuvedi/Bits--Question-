package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
 int [] marks = {5,4,3,2,1};
 Scanner sc = new Scanner(System.in);
 int start = 0;
 int end = marks.length-1;

 while(start<=end)
 {
     int temp;
     temp = marks[start];
     marks[start]=marks[end];
     marks[end] = temp;



     start++;
     end--;
 }
 int i;
 for(i=0;i<marks.length;i++)
 {
     System.out.println(marks[i]);
 }

    }
}
