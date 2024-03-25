package com.example;
import java.util.Arrays;

public class Teh11 {
    public String big(){
        int[] nums = {9,8,32,-2,1};

        Arrays.sort(nums);

        int sum = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];

        String text = sum + " (" + nums[nums.length - 1] + "," + nums[nums.length - 2] + "," + nums[nums.length - 3] + ")";
        return text;
    }

}