package com.company;
class iphone{
static class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        next = null;
    }
}
    public node head;
    public node head2;
    void add(int data)
    {

        node temp = new node(data);
        node ptr = head;
        if(ptr==null)
        {
            head = temp;
            return;
        }

        while(ptr.next!=null)
        {
            ptr = ptr.next;
        }


        ptr.next = temp;

    }

    void val(int data)
    {

        node temp = new node(data);
        node ptr = head2;
        if(ptr==null)
        {
            head2= temp;
            return;
        }

        while(ptr.next!=null)
        {
            ptr = ptr.next;
        }

        ptr.next = temp;

    }
public node head3;
void merge(node head1 , node head2){
        node temp = head1;
        node temp2 = head2;

        if(temp.data>temp2.data) {
  node toadd = new node(temp2.data);
  head3 = toadd;
  temp2 = temp2.next;
        }
    if(temp.data<temp2.data) {
        node toadd = new node(temp.data);
        head3 = toadd;
        temp = temp.next;
    }
    node temp3 = head3;
    while (temp!=null && temp2!=null ){
          if(temp.data<temp2.data)
          {
             node add = new node(temp.data);
             temp3.next = add;
             temp3 = temp3.next;
             temp = temp.next;
          }
          else
          {
              node add = new node(temp2.data);
              temp3.next = add;
              temp3 = temp3.next;
              temp2 = temp2.next;
          }
      }
    while(temp!=null){
        node add = new node(temp.data);
        temp3.next = add;
        temp = temp.next;
    }
        while (temp2!=null){
            node add = new node(temp2.data);
            temp3.next = add;
            temp2 = temp2.next;
        }
        node ptr = head3;
    while(ptr!=null)
    {
        System.out.print("->"+ptr.data);
        ptr = ptr.next;
    }

}

    void printlist(node head){
       node temp = head;
        while(temp!=null)
        {
            System.out.print("->"+temp.data);
            temp = temp.next;
        }
    }


}

public class mergeclass {
    public static void main(String[] args) {

        iphone l1 = new iphone();
        iphone l2 = new iphone();
        iphone l3 = new iphone();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l2.val(2);
        l2.val(4);
        l2. val(6);
        l2.val(8);

        l1.merge(l1.head,l2.head2);
    }
}
