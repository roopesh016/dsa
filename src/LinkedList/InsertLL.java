package LinkedList;

public class InsertLL {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(17);
        ll.insertFirst(8);
        ll.insertLast(90);
        ll.insertLast(100);
        ll.insertLast(151);
        ll.insertAtParticularIndex(95,2);
        ll.print();
        ll.deleteFirst();
        ll.print();
        System.out.println(ll.deleteLast());
        ll.print();
        System.out.println("  The value is present: "+ll.searchForValue(90));
    }
}
