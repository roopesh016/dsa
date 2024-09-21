package LinkedList;


public class LinkedListPractice {

    ListNode head;
    ListNode tail;
    int size;

    LinkedListPractice(){
       this.size =0;
    }


    public void insertFirst(int val){
        ListNode ls = new ListNode(val);
        ls.next = head;
        head = ls;
        if(tail == null)
            tail=head;

        size++;
    }

    public ListNode fetchInserted(ListNode X){
        ListNode temp = X;
        ListNode Y = null;
        while(temp!=null){
            Y = temp;
            temp = temp.next;
        }
        return Y;
    }

    public int calculateMidPoint(ListNode A){
        //calculate mid point
        int count=0;
        while(A!=null){
            count++;
            A= A.next;
        }
        return count/2;
    }

    public void insertLast(int val){
        if(size<=1){
            insertFirst(val);
        }
        ListNode ls = new ListNode(val);
        tail.next = ls;
        tail = ls;
        size++;
    }

    public void reverse() {
        ListNode prev = null;
        ListNode curr = head;

    while (curr !=null){
        ListNode fwd = curr.next;
        curr.next = prev;
        prev = curr;
        curr = fwd;
    }

    head = prev;
    ListNode temp = head;
    while(temp!=null){
        temp = temp.next;
    }
    temp =tail;

    }

    public ListNode reverse(ListNode A){
        ListNode prev = null;
        ListNode curr = A;
        while(curr!=null){
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(B==C)
            return A;

         ListNode curr = A;
         ListNode first = null;
         ListNode from = null;
         ListNode to = null;
         ListNode last = null;

         int count =0;
         while(curr!=null){
             count++;
             if(count < B){
                 first = curr;
             }
             if(count == B) {
                 from = curr;
             } else if(count == C){
                 to = curr;
                 last = to.next;

                 break;
             }
             curr = curr.next;
         }
        to.next = null;
        reverseFrom(from);
        if(first!=null)
            first.next = to;
        else
            head = to;

        from.next = last;
        return head;
    }

    public ListNode reverseFrom(ListNode from){
        ListNode curr = from;
        ListNode prev = null;

        while (curr != null) {
           ListNode fwd = curr.next;
           curr.next = prev;
           prev = curr;
           curr = fwd;
        }
        return prev;
    }

    public void printLL(){
        ListNode  temp= head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
//        System.out.println("END");
    }

    public int compare(ListNode A, ListNode B){
        if(A.next!=null||B.next!=null)
            return 1;
        //1,1,3,2,1,1
        //1,1,2,3,1,1
        while(A!=null && B!=null){
            if(A.val != B.val)
                return 0;
          A = A.next;
          B = B.next;
        }
        return 1;
    }

    public void printLL(ListNode head){
        ListNode  temp= head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
//        System.out.println("END");
    }

   public void insertAtParticularIndex(int val, int index){
      if(index==0){
          insertLast(val);
          return;
      }

      if(index == size){
          insertLast(val);
          return;
      }

      ListNode temp = head;
      for(int i = 0; i<index; i++){
          temp = temp.next;
      }

      ListNode ls = new ListNode(val,temp.next);
      temp.next = ls;

      size++;

   }

   public void deleteFirst(){
       head = head.next;
       if(tail==head)
           tail =null;
       size--;
   }

   public void deleteLast(){
        if(size <=1){
            deleteFirst();
        }
        ListNode temp = head;
        for(int i =1; i<size-1; i++){
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
   }

   public void reverseList(ListNode A,int B){
        if(B==1)
            return;
        ListNode from = null;
        ListNode to = null;
        ListNode curr = A;
        ListNode last =null;
        int count =0;
        from = curr;
        while(curr!=null){
            count++;
            if(count==B) {
                to = curr;
                last = to.next;
                to.next = null;
                reverseFrom(from);
            }
           curr = curr.next;
        }

       from.next = last;
       head = to;

   }

   public int findMidValue(ListNode ls){

        if(ls.next==null)
            return ls.val;

        ListNode slow = ls,fast = ls;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
   }



   public void deleteAtParticularIndex(int index){
        if(index == 0){
            deleteFirst();
        }

        if(index == size){
            deleteLast();
        }
       ListNode whichOneToDelete = getNode(index);

       ListNode prev = getNode(index-1);
       int val =  getValue(index);
       prev.next = prev.next.next;
       whichOneToDelete.next = null;


   }

   public int getValue(int index){
        ListNode x = head;
        for(int i=0; i<index; i++){
            x = x.next;
        }
       return x.val;
   }

   public ListNode getNode(int index){
       ListNode x = head;
       for(int i=0; i<index; i++){
           x = x.next;
       }
       return x;
   }



   public boolean searchValue(int val){
       return  false;
   }

   class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

}
