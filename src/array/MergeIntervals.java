package array;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by chengma on 7/27/15.
 * Given a collection of intervals, merge all overlapping intervals.

 For example,
 Given [1,3],[2,6],[8,10],[15,18],
 return [1,6],[8,10],[15,18].
 */


public class MergeIntervals {
    public static void main(String[] args) {
        List<Interval> list = new LinkedList<>();
        list.add(new Interval(1,4));
        list.add(new Interval(0, 0));
        list.add(new Interval(8,10));
        list.add(new Interval(15,18));
        System.out.println(merge(list));
    }
    public static List<Interval> merge(List<Interval> intervals) {
        Comparator<Interval> comparator = new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        };
        Collections.sort(intervals, comparator);

        List<Interval> res = new LinkedList<>();
        for (int index = 0; index < intervals.size(); index ++) {
            Interval interval = intervals.get(index);
            while (index + 1 < intervals.size() && interval.end >= intervals.get(index + 1).start) {
                interval.end = Math.max(interval.end, intervals.get(index + 1).end);
                index++;
            }
            res.add(interval);
        }
        return res;
    }


    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
        public String toString(){
            return "["+start+","+end+"]";
        }
    }
}
