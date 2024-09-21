package probs;

public class FlipZerosOnce {

    public static int canReplace(
            int[] array)
    {
        int ans =0;

        int n = array.length;
        for(int i=0; i<n; i++){
            if(array[i]==0){
                //check the adjacent values
                if(i==0){
                    //check the adjacent right
                    if(array[i+1]==0){
                        ans++;
                    }
                } else if(i==n-1){
                    //check the adjacent left
                    if(array[n-2]==0){
                        ans++;
                    }
                }else{
                   if(array[i+1]==0 && array[i-1]==0){
                       ans++;
                   }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1,0,0,0,1,0,0};
        System.out.println(canReplace(array));
    }
}
