    package com.company;

    public class powert {
        public static void main(String[] args) {
         int[] arr = {4,2,3,1,5,12,34,3,7,4,67,78,5,4,5,7,9,1,2,4,565,657,43232,546574,7};
         int n = arr.length-1;
         int sum = 6;

         subs2(arr,sum,n);
         System.out.println(count);
        }

        static int count = 0;
        static int subs2(int[] arr, int sum ,int n)
        {
            if(n<1)
            {
                return count;
            }

            int i;
            for(i=n-1;i>=0;i--)
            {
                if(arr[n]+arr[i] == sum){
                 count++;
                }
            }
            return subs2(arr, sum , n-1);
        }
    }
