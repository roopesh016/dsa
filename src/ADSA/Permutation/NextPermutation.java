package ADSA.Permutation;

public class NextPermutation {

    public static int[] next_permutation(int[] A){
      int i = A.length - 2;
      while(i>=0 && A[i]>= A[i + 1]) i--; // 2

      if(i>=0){
          int j = A.length-1;
          while (A[j]<=A[i]) j--;
          swap(A,i,j);
      }
      reverse(A,i+1,A.length-1);
      return A;
    }

    public static void swap(int[] A , int s, int e){
        int temp = A[s];
        A[s] = A[e];
        A[e] = temp;
    }

    public static void reverse(int[] A, int s,int e){
        while(s<e){
            swap(A,s++,e++);
        }
    }

    public static void main(String[] args) {
        int[] A ={1, 2, 3};
        next_permutation(A);
    }

}
