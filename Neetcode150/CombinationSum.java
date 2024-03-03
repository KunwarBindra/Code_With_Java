package Neetcode150;
import java.util.*;

// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
// frequency
//  of at least one of the chosen numbers is different.

// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

// Example 1:

// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]
// Explanation:
// 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
// 7 is a candidate, and 7 = 7.
// These are the only two combinations.
// Example 2:

// Input: candidates = [2,3,5], target = 8
// Output: [[2,2,2,2],[2,3,3],[3,5]]
// Example 3:

// Input: candidates = [2], target = 1
// Output: []


class Solution {
    public void findCombinations(int[] nums, List<List<Integer>> intArrayList, List<Integer> intArray, int sum,
            int target, int startIdx) {
        if (sum == target) {
            intArrayList.add(new ArrayList<>(intArray));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = startIdx; i < nums.length; i++) {
            List<Integer> newCurrArr = new ArrayList<>(intArray);
            newCurrArr.add(nums[i]);
            findCombinations(nums, intArrayList, newCurrArr, sum+nums[i], target, i);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> intArrayList = new ArrayList<>();
        List<Integer> intArray = new ArrayList<>();
        int sum = 0;
        findCombinations(candidates, intArrayList, intArray, sum, target, 0);
        return intArrayList;
    }
}
