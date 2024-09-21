package check;

public class MajorityElementCheck {

    public static int majorityElement(final int[] A) {
        int major = A[0];
        int count =1;
        int n = A.length;
        for(int i=1; i<n ; i++){
            if(A[i]==major){
                count++;
            }
            else if(count ==0){
                major = A[i];
                count =1;
            } else{
                count --;
            }
        }

       int frequency = 0;
       for(int i =0; i<n ; i++) {
           if (A[i] == major) {
               frequency++;
           }
       }

       if(frequency>n/2)
           return major;
       else
           return -1;
    }


    public static void main(String[] args) {
        int[] A = {3,3,3,1,1,2,4,5};
        System.out.println(majorityElement(A));
    }


}
