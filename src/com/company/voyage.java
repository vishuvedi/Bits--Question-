package com.company;

public class voyage {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,2,2,2,4,4,4};
        int n = arr.length;
        int sum = 0;
 for(int i=0;i<n;i++)
 {
     String s1 = Integer.toBinaryString(arr[i]);
     sum = sum+ Integer.parseInt(s1);

 }
 System.out.println(sum);
 int a = sum;
while(sum>0)
{  a=a%10;
    System.out.println(a%3);
    sum=sum/10;
    a=sum;
}

    }
}
