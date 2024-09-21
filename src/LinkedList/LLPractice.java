package LinkedList;

public class LLPractice {


    public static void main(String[] args) {
      LinkedListPractice llp = new LinkedListPractice();
      llp.insertFirst(1);
      llp.insertFirst(1);
      llp.insertFirst(3);
      llp.insertFirst(2);
      llp.insertFirst(1);
      llp.insertFirst(1);
      llp.printLL();
      System.out.println("--inserted--");
      System.out.println("New list node");
      System.out.println(llp.findMidValue(llp.head));
    }
}
