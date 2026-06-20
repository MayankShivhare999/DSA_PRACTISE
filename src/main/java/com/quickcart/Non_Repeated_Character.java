package com.quickcart;

import java.util.LinkedHashMap;
import java.util.Map;

public class Non_Repeated_Character {


//    Find First Non-Repeated Character
//    Input: "aabbccddefg"
//    Output: e


    public static char getNonRepeatedCharacter(String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(entry.getValue()==1) {
                return entry.getKey();
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String input = "aabbccddefg";
        System.out.println(getNonRepeatedCharacter(input));
    }
}
