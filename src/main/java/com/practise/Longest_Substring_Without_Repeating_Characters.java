package com.practise;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

//    Longest Substring Without Repeating Characters
//    Given a string s, find the length of the longest substring without repeating characters.
//    Input: "abcabcbb"
//    Output: 3

    public static int getLongestSubstringLength(String s) {
        char[] ch = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int res = 0, left = 0;
        for(int i=0; i<ch.length; i++) {
            while(set.contains(ch[i])) {
                set.remove(ch[left]);
                left++;
            }
            set.add(ch[i]);
            res = Math.max(res, i-left+1);

        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(getLongestSubstringLength(str));
    }
}
