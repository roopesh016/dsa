package LinkedList.DoublyLinkedList;

public class DoubleLL {

    NodeDD head;
    NodeDD tail;
    int size;

    public  void insertDataInDoubleLL(int value){
        NodeDD prev =null;
        NodeDD next = null;
        NodeDD dd = new NodeDD(prev,value,next);
        dd.next = head;
        head = dd;
        if(head!= null){
            head.prev = dd;
        }
        if(tail == null)
            head = tail;

        size++;
    }


    public void insertDataInDoubleLLAtParticularIndex(int index, int value){
        if(index==0){
            insertDataInDoubleLL(value);
        }




    }

    public void deleteNode(int value){

    }

    public void insertDataInDoubleLLAtTail(int value){

    }


    private class NodeDD{
        NodeDD prev;
        int x;
        NodeDD next;

        NodeDD(int x){
            this.x = x;
        }

        NodeDD(NodeDD prev, int x , NodeDD next){
            this.prev = prev;
            this.x = x;
            this.next = next;
        }
    }
}
