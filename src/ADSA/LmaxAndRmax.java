package ADSA;

public class LmaxAndRmax {


    //Given an array find the lMax and rMax
    public static int[][] findBothLmaxRmax(int[] Arr){
      int[] lMax = new int[Arr.length];
      int[] rMax = new int[Arr.length];
      //Find lMax
        lMax[0]=Arr[0];
        for(int i=1; i<Arr.length; i++){
          lMax[i]=Math.max(lMax[i-1],Arr[i]);
        }
      //Find rMax
        rMax[Arr.length-1] = Arr[Arr.length-1];
        for(int r=Arr.length-2; r>=0; r--){
            rMax[r]=Math.max(rMax[r+1],Arr[r]);
        }

        int[][] twoDArray = new int[Arr.length][2];

        for(int i =0; i<lMax.length; i++){
            twoDArray[i][0]=lMax[i];
        }

        for(int i =0; i<rMax.length; i++){
            twoDArray[i][1]=rMax[i];
        }

        return twoDArray;
    }

    public static void main(String[] args) {
        int[] Arr = {1,7,-3,4,2,-8,-6};
        findBothLmaxRmax(Arr);
    }
}
