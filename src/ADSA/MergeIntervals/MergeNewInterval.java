package ADSA.MergeIntervals;

import java.util.ArrayList;

//Merge new interval and get the non overlapping list
public class MergeNewInterval {

    public ArrayList<Interval> check(ArrayList<Interval> intervals,Interval newInterval ){
        ArrayList<Interval> nonOverLappingInterval = new ArrayList<>();
        int n = intervals.size();
        for(int i=0; i<n; i++){
            if(intervals.get(i).end<newInterval.start){
                nonOverLappingInterval.add(new Interval(intervals.get(i).start,intervals.get(i).end));
            }
            else if(intervals.get(i).start>newInterval.end){
                nonOverLappingInterval.add(new Interval(newInterval.start,newInterval.end));
                for(int j=i; j<n; j++){
                    nonOverLappingInterval.add(new Interval(intervals.get(j).start,intervals.get(j).end));
                }
                return nonOverLappingInterval;
            } else {
                newInterval.start = Math.min(intervals.get(i).start,newInterval.start);
                newInterval.end = Math.max(intervals.get(i).end,newInterval.end);
            }
        }
        nonOverLappingInterval.add(new Interval(newInterval.start,newInterval.end));
        return nonOverLappingInterval;
    }

}
