package com.company;

public class inversion {
    public int g1(int[] arr , int s ,int mid,int e)
    {
        
return 0;
    }
   public int inv(int[] arr, int s ,int e)
    {
        int invt =0;
if(s<e) {
    int mid = (s + e) / 2;
    invt = invt + inv(arr, s, mid);
    invt = invt + inv(arr, mid + 1, e);
    invt = invt + g1(arr, s, mid, e);
}
return invt;
    }
    public static void main(String[] args) {
       int s1[] = new int[] {0,5,2,3,1};
       int e = s1.length-1;
       int s =0;
       inversion t1 = new inversion();
       int hero = t1.inv(s1,s,e);
       System.out.println(hero);


    }
}
