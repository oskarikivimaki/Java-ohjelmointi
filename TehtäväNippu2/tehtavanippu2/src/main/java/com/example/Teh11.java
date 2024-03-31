package com.example;

public class Teh11 {
    public int big(){
        int[] nums = {9,8,32,-2,1};
        int max = nums[0] + nums[1] + nums[2];
        int current = max;

        for(int i = 3; i < nums.length; i++){
            current = current - nums[i - 3] + nums[i];
            max = Math.max(max, current);
        }
        return max;
    }
}