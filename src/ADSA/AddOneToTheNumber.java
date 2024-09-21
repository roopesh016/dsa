package ADSA;

import java.util.ArrayList;

public class AddOneToTheNumber {


    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 1; // Start with carry = 1 because we want to add one to the number.

        // Remove leading zeros
        while (!A.isEmpty() && A.get(0) == 0) {
            A.remove(0);
        }

        for (int i = A.size() - 1; i >= 0; i--) {
            int num = A.get(i);
            int sum = num + carry;
            A.set(i, sum % 10); // Update the current digit.
            carry = sum / 10;  // Update carry for the next iteration.
        }

        // If there's still a carry after the loop, add it as a new digit.
        if (carry > 0) {
            A.add(0, carry);
        }


        return A;
    }

    public static void main(String[] args) {
          ArrayList<Integer> AL = new ArrayList<>();
//        1,1,1,3,2,1,1,2,5,9,6,5
          AL.add(1);
          AL.add(1);
          AL.add(1);
          AL.add(3);
          AL.add(2);
          AL.add(1);
          AL.add(1);
          AL.add(2);
          AL.add(5);
          AL.add(9);
          AL.add(6);
          AL.add(5);
          plusOne(AL);
    }
}
