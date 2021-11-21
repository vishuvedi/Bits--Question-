package com.company;
import java.util.*;
class linked{
    static class node{
        int data;
        node next;
        public node(int data)
        {
            this.data = data;
            next = null;
        }
    }
node head;
    void add(int data){
        node toadd = new node(data);
        node temp = head;
            if(temp==null)
            {
                head = toadd;
                return;
            }
            while (temp.next !=null)
            {
                temp=temp.next;
            }
            temp.next = toadd;
    }

    void printlist(){
        node temp = head;
        while(temp!=null)
        {
            System.out.print("->"+temp.data);
            temp = temp.next;
        }
    }

    void reverselist() {
        node curr = head;
       node prev = null;
        while (curr != null) {
    node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }


}

public class linkedlist {
    public static void main(String[] args) {
linked ll = new linked();
ll.add(89);
ll.add(88);
ll.add(87);
ll.add(67);
ll.reverselist();
ll.printlist();
int k = 2;

        ll.printlist();
    }
}
