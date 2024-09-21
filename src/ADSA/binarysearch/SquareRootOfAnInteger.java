package ADSA.binarysearch;

public class SquareRootOfAnInteger {

    public static int sqrt(int A){
        int i =1;
        int ans = 0;
        while(i*i<=A){
            ans = i;
            i++;
        }
        return ans;
    }

    public static int binarySearchsqrt(int A){
        int low = 1;
        int high = A;
        int ans =0;

        while(low<=high){
            int mid = (low+high)/2;
            int x = mid*mid;

            if(x==high){
                ans = mid;
            }

            else if(x>high){
               high = mid-1;
            }

            else {
                ans = mid;
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
