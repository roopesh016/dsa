package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {


    public static String largestNumber(ArrayList<Integer> A)
    {
        Collections.sort(A, new Largenumber());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A.size(); i++)
        {
            sb.append(Integer.toString(A.get(i)));
        }
        if(A.get(0) == 0)
        {
            return "0";
        }
        return sb.toString();
    }


    public static void main(String[] args){
        ArrayList<Integer> Al = new ArrayList<>();
        Al.add(3);
        Al.add(9);
        Al.add(30);
        Al.add(34);
        Al.add(5);

        System.out.println(largestNumber(Al));
    }


}

class Largenumber implements Comparator<Integer>
{
    public int compare(Integer a , Integer b)
    {
        String x =String.valueOf(a)+String.valueOf(b);
        String y =String.valueOf(b)+String.valueOf(a);
        return y.compareTo(x);
    }
}
