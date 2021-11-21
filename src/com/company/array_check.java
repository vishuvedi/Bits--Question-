package com.company;
class  star{
 public void cal(int[] temp)
 {
     temp[0] = 0;
 }
}
public class array_check {
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,1,2};
        star s2 = new star();
        s2.cal(arr);
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
