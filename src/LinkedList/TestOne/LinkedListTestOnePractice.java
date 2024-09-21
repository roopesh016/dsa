package LinkedList.TestOne;

public class LinkedListTestOnePractice {

    public static void main(String[] args) {
       LinkedListTestOne linkedListTestOne = new LinkedListTestOne();
       linkedListTestOne.insertValue(9);
       linkedListTestOne.insertValue(9);
       linkedListTestOne.insertValue(1);
       linkedListTestOne.display(linkedListTestOne.head);
       LinkedListTestOne.NodeList X = linkedListTestOne.creation(linkedListTestOne.head);
       linkedListTestOne.display(X);
       LinkedListTestOne.NodeList Y  = linkedListTestOne.createOnlyOne(1);
       linkedListTestOne.addTwoNumbers(X,Y);
    }
}
