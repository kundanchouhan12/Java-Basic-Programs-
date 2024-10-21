package com.example;

public class Linkedlist {
   public static class Node {
       int data;
       Node next;

       Node(int data){
           this.data = data;
       }
   }

   public static void main(String[] args) {
       Node a = new Node(21);
       Node b = new Node(34);
       Node c = new Node(36);
       Node d = new Node(39);

       a.next = b;
       b.next = c;
       c.next = d;

       Node temp = a;
      
       while (temp != null) {
        System.out.println(temp.data+" ");
        temp = temp.next;
       }
   }
}

