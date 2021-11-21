package com.company;
import java.util.*;

class list {
    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            next = null;
        }
    }

    static node head;

    void tobegin(int data) {
        node s1 = new node(data);
        node temp = head;
        if (temp == null) {
            head = s1;
            return;
        }

        s1.next = head;
        head = s1;


    }

    void delend() {
        node temp = head;
        if (temp == null) {
            System.out.println("list is empty");
            return;
        }

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;


    }

    void printlist() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;

        }
    }

    node ptr = head;

    void reverselist() {
        node curr = head;
        node prev = null;
        while (curr != null) {
            node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = curr;
    }

    public class valuer {
        public static void main(String[] args) {
            list l1 = new list();
            l1.tobegin(78);
            l1.tobegin(87);
            l1.tobegin(66);
            l1.tobegin(45);
            l1.tobegin(76);
            l1.printlist();

            l1.delend();
            l1.reverselist();
            l1.printlist();


        }
    }
}