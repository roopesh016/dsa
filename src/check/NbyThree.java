package check;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NbyThree {

    public static int repeatedNumber(final List<Integer> a) {
        int n = a.size();

        int ans =-1;

        HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();

        for(int i =0; i<n; i++){
            if(hMap.containsKey(a.get(i))){
                int frequencey = hMap.get(a.get(i));
                hMap.put(a.get(i),frequencey+1);
            }else{
                hMap.put(a.get(i),1);
            }
        }

        int max = 0;
        for(Map.Entry<Integer,Integer> entry: hMap.entrySet()){
            if(entry.getValue()>1){
                max = Math.max(max,entry.getValue());
            }
        }

        if(max>n/3){
            ans =1;
        }
        return ans;
    }



    public static int repeatedNumber(int[] A) {
        int n = A.length;

        int ans =-1;

        HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
        for(int i =0; i<n; i++){
            if(hMap.containsKey(A[i])){
                int frequencey = hMap.get(A[i]);
                hMap.put(A[i],frequencey+1);
            }else{
                hMap.put(A[i],1);
            }
        }

        int max = 0;
        double temp = n / (3 * 1.0);
        for(Map.Entry<Integer,Integer> entry: hMap.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            if (value > temp) {
                return key;
            }
        }
//            if(entry.getValue()>1){
//                max = Math.max(max,entry.getValue());
//            }


//        if(max>n/3){
//            ans =1;
//        }
        return -1;
    }


    public static List<Integer> majorityElement(int[] nums) {
        int number1=-1;
        int number2=-1;

        int count1=0;
        int count2=0;

        int n = nums.length;

        for(int i=0; i<n; i++)
            if(number1==nums[i]){
                count1++;
            }

            else if(number2==nums[i]){
                count2++;
            }


            else if(count1==0){
                number1=nums[i];
                count1++;
            }

            else if(count2==0){
                number2=nums[i];
                count2++;
            }

            else{
                count1--;
                count2--;
            }

        int frequencyOne=0;
        int frequencyTwo=0;

        List<Integer> l1 = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(number1==nums[i]){
                frequencyOne++;
            }

            if(number2==nums[i]){
                frequencyTwo++;
            }
        }


        if(frequencyOne>n/3){
            l1.add(number1);
        }

        if(frequencyTwo>n/3){
            l1.add(number2);
        }

        return l1;
    }

    public static void main(String[] args) {
//        int[] A = {1, 2, 3};
//        List<Integer> al = new ArrayList<>();
//        al.add(1000441);
//        al.add(1000441);
//        al.add(1000994);
//        int[] A = {1000441, 1000441, 1000994 };
//        System.out.println(repeatedNumber(al));
        int[] B = {1,1,1,2,2,3,3,3};
        majorityElement(B);
    }
}
