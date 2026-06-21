package com.practise;

import java.util.Arrays;

public class Product_of_Array_Except_Self {

    public static int[] productsExceptSelf(int[] nums) {
        int prod = 1;
        for(int n : nums) {
            prod *= n;
        }
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            res[i] = prod/nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productsExceptSelf(nums)));
    }
}
