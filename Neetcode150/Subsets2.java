package Neetcode150;
import java.util.*;

// Given an integer array nums that may contain duplicates, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 

// Example 1:

// Input: nums = [1,2,2]
// Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]

class Solution {
    public void findSubsets(int[] nums, List<List<Integer>> intArrayList, List<Integer> intArray, int i,
            HashSet<ArrayList<Integer>> set) {
        if (i == nums.length) {
            if (set.contains(intArray)) {
                return;
            } else {
                intArrayList.add(new ArrayList<>(intArray));
                set.add(new ArrayList<>(intArray));
                return;
            }
        }
        intArray.add(nums[i]);
        findSubsets(nums, intArrayList, intArray, i + 1, set);
        intArray.remove(intArray.size() - 1);
        findSubsets(nums, intArrayList, intArray, i + 1, set);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> intArrayList = new ArrayList<>();
        List<Integer> intArray = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        findSubsets(nums, intArrayList, intArray, 0, set);
        return intArrayList;
    }
}
