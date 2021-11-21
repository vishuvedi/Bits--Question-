package com.company;
import java.util.Scanner;

public class findstring {
    public static void main(String[] args) {
        String m = " this is a boy lives at a side of twn with another boy in this colony this near bell side of another boy";
int size;
size = m.length();
int k=0;
int index=0;
while(k!=size)
{

    index = m.indexOf("this",index+1);
    if(index!=-1) {
        System.out.println(index);
    }
    else if(index==-1)
    {
        System.out.println("string not found");
        break;
    }

    k++;
}


    }
}
