package Neetcode150;

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // using 2 pointers approach, testcases passed but will fail in this case =>
        // [1,1,2,3,4]
        // int left = 0;
        // int right = nums.length - 1;
        // while (left < right) {
        // if (nums[left] == nums[right]) {
        // return true;
        // } else {
        // left++;
        // right--;
        // }
        // }
        // return false;

        // nums sorted using bubble sort, can be sorted with any algo
        // for (int i = 0; i < nums.length - 1; i++) {
        // for (int j = 0; j < nums.length - i - 1; j++) {
        // if (nums[j] > nums[j + 1]) {
        // int temp = nums[j + 1];
        // nums[j + 1] = nums[j];
        // nums[j] = temp;
        // }
        // }
        // }
        // after sorting, iterated nums to check if 2 consecutive elements are same
        // for (int i = 1; i < nums.length; i++) {
        // if (nums[i] == nums[i - 1]) {
        // return true;
        // }
        // }
        // return false;

        // using hashset to manage time complexity
        HashSet<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerSet.contains(nums[i])) {
                return true;
            } else {
                integerSet.add(nums[i]);
            }
        }
        return false;
    }
}
