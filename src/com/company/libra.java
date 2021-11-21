package com.company;
import java.util.Scanner;

import java.io.StringReader;

class library
{
private String avbok[]  = new String[100];
private String isbok[] = new String[100];
library()
{
    avbok[0]="depth in c ";
    avbok[1]="depth c++";
    avbok[2]="logic desgine";
    avbok[3]="principle of java";
    avbok[4]="system desgine";
}
public void addAvbok(String s)
{
    int c = 0;
    for(String i : avbok)
    {
        if(i==null)
        {
            avbok[c]=s;
            break;
        }
        c++;
    }
}
public void showbook()
{
    for(String m : avbok)
    {
        if(m!=null) {
            System.out.println(m);
        }

    }
}
public void issuebook(String s)
{
    int c=0;
   String l = "issued";
    for(String m : avbok)
    {
        if(s == m)
        {
            avbok[c]=l;
            break;
        }
        c++;
    }
}
public void returnbook(String s)
{int c =0;
    for (String m:avbok) {
 if(m=="issued")
 {
     avbok[c]=s;
     break;
 }
 c++;
    }
}

}


public class libra {
    public static void main(String[] args) {
        library l1 = new library();
        Scanner sc = new Scanner(System.in);
        boolean a = true;
 while(a)
 {
     System.out.println(" Press 1 to add the books");
     System.out.println("pres 2 to show the available books");
     System.out.println("press 3 to get a book");
     System.out.println("press 4 to return the book");
     System.out.println("exit ");
     int choice ;
     choice = sc.nextInt();
     switch (choice)
     {
         case 1:
         {
             System.out.print("enter the book name you want to add");
             String add;
             add = sc.next();
             l1.addAvbok(add);
             break;
         }
         case 2:
         {l1.showbook();
             break;
         }
         case 3:
         {
             System.out.print("enter the book name you want to study");
             String dd;
             dd = sc.next();
             l1.issuebook(dd);
             break;
         }
         case 4:
         {
             System.out.print("enter the book name you want to return ");
             String dn;

             l1.returnbook( sc.nextLine());
             break;
         }
         case 5:
         {
             a = false;
             break;
         }
     }
 }
    }

}