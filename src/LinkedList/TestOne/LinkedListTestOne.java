package LinkedList.TestOne;

public class LinkedListTestOne {

    int val;
    NodeList head;
    int size=0;

    public void insertValue(int val){
        NodeList nL = new NodeList(val);
        nL.next = head;
        head = nL;

        size++;
    }


    public void display(NodeList X){
        NodeList temp = X;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public NodeList reorderList(NodeList A) {
        if(A==null || A.next==null)
            return A;

        //Using reverse logic
        NodeList slow = A;
        NodeList fast = A;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        NodeList h1 = A;
        NodeList h2 = reverseLinkedList(slow.next);

        while(h1!=null || h2!=null){
           NodeList temp1 = h1.next;
           NodeList temp2 = h2.next;
           h1.next = h2;
           h1 = temp1;
           h2.next = h1;
           h2 = temp2;
        }

        return A;
    }

    public NodeList creation(NodeList Y){
        NodeList ans = new NodeList(0);
        NodeList curr = ans;
        while(Y!=null){
            NodeList newNode = new NodeList(Y.val);
            curr.next = newNode;
            curr = curr.next;
            Y = Y.next;
        }
        return ans.next;
    }

    public NodeList createOnlyOne(int val){
        NodeList list = new NodeList(val);
        return list;
    }

    public NodeList reverseLinkedList(NodeList X){
        NodeList curr = X;
        NodeList prev = null;
        while(curr!=null){
            NodeList next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public NodeList addTwoNumbers(NodeList A, NodeList B) {
        //reverse the linkedList of A & B
        //Traverse the LinkedList and append it to string
        //Convert the string to int and do addition
        //Convert the addition result to string
        //Iterate the string and add the value from revrse int to newly created LL
        NodeList ans = new NodeList(0);
        NodeList curr = ans;
        if(A==null){
            return A;
        }

        if(B==null){
            return B;
        }

        NodeList reverseA = reverseLinkedList(A);
        NodeList reverseB = reverseLinkedList(B);

        String C = "";
        String D = "";
        while(reverseA!=null ){
            C = String.valueOf(reverseA.val);
            reverseA = reverseA.next;
        }

        while(reverseB!=null){
            D = String.valueOf(reverseB.val);
            reverseB = reverseB.next;
        }

        int Q1 = Integer.parseInt(C.trim());
        int Q2 = Integer.parseInt(D.trim());

        int Q3 = Q1+Q2;

        String E = String.valueOf(Q3);


        for(int i=0; i < E.length(); i++){
            NodeList newNode = new NodeList(Integer.parseInt(String.valueOf(E.charAt(i))));
            curr.next = newNode;
            curr = curr.next;
        }
        return ans.next;
    }


    class NodeList{
        int val;
        NodeList next;

        NodeList(int val){
            this.val = val;
            next = null;
        }
    }
}
