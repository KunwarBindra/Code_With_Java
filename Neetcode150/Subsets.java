package Neetcode150;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// Given an integer array nums of unique elements, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]

class Solution {
    public void findSubsets(int[] nums, List<List<Integer>> intArrayList, List<Integer> intArray, int i) {
        if (i == nums.length) {
            System.out.println(intArray);
            intArrayList.add(new ArrayList<>(intArray));
            return;
        }
        intArray.add(nums[i]);
        findSubsets(nums, intArrayList, intArray, i + 1);
        intArray.remove(intArray.size() - 1);
        findSubsets(nums, intArrayList, intArray, i + 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> intArrayList = new ArrayList<>();
        List<Integer> intArray = new ArrayList<>();
        findSubsets(nums, intArrayList, intArray, 0);
        return intArrayList;
    }
}
