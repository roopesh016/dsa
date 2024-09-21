package ADSA.MergeIntervals;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {


        intervals.sort((x, y) -> {
            return Integer.compare(x.start, y.start);
        });

        ArrayList<Interval> al = new ArrayList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start <= end) {
                start = Math.min(start, intervals.get(i).start);
                end = Math.max(end, intervals.get(i).end);
            } else {
                al.add(new Interval(start, end));
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        al.add(new Interval(start, end));
        return al;
    }


}
