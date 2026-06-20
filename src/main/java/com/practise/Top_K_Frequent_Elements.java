package com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top_K_Frequent_Elements {

//    Top K Frequent Elements
//    Given an integer array nums and an integer k, return the k most frequent elements.

//    Input:
//    nums = [1,1,1,2,2,3]
//    k = 2
//
//    Output:
//    [1,2]

    static class Pair {
        final int val;
        final int freq;

        public Pair(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }
    }

    public static List<Integer> getResult(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        List<Pair> pairs = new ArrayList<>();

        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            pairs.add(new Pair(e.getKey(), e.getValue()));
        }
        pairs.sort((o1, o2) -> Integer.compare(o2.freq, o1.freq));

        List<Integer> res = new ArrayList<>();
        for(int i=0; i<k; i++) {
            res.add(pairs.get(i).val);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        System.out.println(getResult(nums, k));
    }
}
