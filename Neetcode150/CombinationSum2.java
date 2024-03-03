package Neetcode150;
import java.util.*;

// Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

// Each number in candidates may only be used once in the combination.

// Note: The solution set must not contain duplicate combinations.

 

// Example 1:

// Input: candidates = [10,1,2,7,6,1,5], target = 8
// Output: 
// [
// [1,1,6],
// [1,2,5],
// [1,7],
// [2,6]
// ]
// Example 2:

// Input: candidates = [2,5,2,1,2], target = 5
// Output: 
// [
// [1,2,2],
// [5]
// ]

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
            // to skip duplicate elements
            if (i > startIdx && nums[i] == nums[i-1]) {
                continue;
            }
            List<Integer> newCurrArr = new ArrayList<>(intArray);
            newCurrArr.add(nums[i]);
            findCombinations(nums, intArrayList, newCurrArr, sum+nums[i], target, i+1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> intArrayList = new ArrayList<>();
        List<Integer> intArray = new ArrayList<>();
        int sum = 0;
        Arrays.sort(candidates);
        findCombinations(candidates, intArrayList, intArray, sum, target, 0);
        return intArrayList;
    }
}
