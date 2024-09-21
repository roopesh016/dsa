package binarysearch;

public class Painters implements Painter {

    @Override
    public int requiredNumberOfPainters(int[] boards, int timeUnit, int x) {
        int timeLeft = x;
        int requiredPainters = 1;
        for(int i=0; i<boards.length; i++){
            if(boards[i]*timeUnit > x) return -1;
            if(boards[i]*timeUnit<=timeLeft){
                timeLeft = timeLeft-boards[i]*timeUnit;
            }else{
                requiredPainters++;
                timeLeft = x-boards[i]*timeUnit;
            }
        }
        return requiredPainters;
    }
}
