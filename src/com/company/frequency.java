package com.company;
class bin{
    public int count(int[] arr , int search)
    {
        int s =0;
        int e = arr.length-1;
        int count=0;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==search)
            { int i = mid;
                while(arr[i]==search){
                    i++;
                    count++;
                }
                return count;
            }
            else if(arr[mid]<search)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
     return 0;
    }
}
public class frequency {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,1,2,2,2,3,3,3};
        int value = 1;
        int count;
        bin o2 = new bin();

        count =o2.count(arr,value);
        System.out.println(count);


    }
}
