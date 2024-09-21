package com.company;

public class LinkedListCode {

   Node tail;
   Node head;
   int length;


    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    LinkedListCode(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    void print(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
             tail.next = node;
             tail = node;
        }
        length++;
    }

    void prepand(int value){
        Node node = new Node(value);
        if(length ==0){
            head = node;
            tail = node;
        }
        else {
            head = node;
        }
        length ++;
    }

    void getHeadValue(){
        System.out.println(head.value);
    }

    public static void main(String[] args) {
        LinkedListCode llC = new LinkedListCode(4);
        llC.append(5);
        llC.print();
        llC.prepand(3);
        llC.print();
        llC.getHeadValue();
    }

}
