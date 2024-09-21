package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    LinkedList(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);// value is inserted in a new node
        node.next = head; // point the inserted node to the head
        head = node; // point the head to the node
        if(tail == null)
            tail = head;

        size++;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtParticularIndex(int val, int index){
      //zero based index
        if(index ==0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }


        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public boolean searchForValue(int val){
        Node temp = head;
        while (temp!=null){
            if(temp.value == val)
                return true;
            temp = temp.next;
        }
        return false;
    }



    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public int deleteLast(){
        if(size <=1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size --;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0; i<index ; i++){
            node = node.next;
        }
        return node;
    }

    public void print(){
        Node temp;
        temp = head;
        while(temp !=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.print("END");
    }

    private class Node{
        private  int value;
        private  Node next;

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        Node(int value){
            this.value = value;
        }
    }
}
