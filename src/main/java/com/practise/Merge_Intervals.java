package com.practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {

    // first = 1, if 3<2 continue
    // if 6<8 last = 6-- 1,6 first = 8
    // if 10<15 last = 10-- 8,10 first = 15

    public static List<List<Integer>> getMergedList(List<List<Integer>> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        }

        list.sort(Comparator.comparingInt(a -> a.get(0)));

        List<List<Integer>> res = new ArrayList<>();

        int start = list.get(0).get(0);
        int end = list.get(0).get(1);

        for (int i = 1; i < list.size(); i++) {
            int currStart = list.get(i).get(0);
            int currEnd = list.get(i).get(1);

            if (currStart <= end) {
                end = Math.max(end, currEnd);
            } else {
                res.add(List.of(start, end));
                start = currStart;
                end = currEnd;
            }
        }

        res.add(List.of(start, end));

        return res;
    }


    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1,3));
        list.add(List.of(2,6));
        list.add(List.of(8,10));
        list.add(List.of(15,18));
        System.out.println(getMergedList(list));
    }


}
