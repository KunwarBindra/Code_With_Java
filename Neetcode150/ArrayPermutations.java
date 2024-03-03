package Neetcode150;
import java.util.ArrayList;
import java.util.List;

// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// Example 2:

// Input: nums = [0,1]
// Output: [[0,1],[1,0]]
// Example 3:

// Input: nums = [1]
// Output: [[1]]


class Solution {
    public void permutations(List<Integer> intArray, List<List<Integer>> intArrayList, List<Integer> currentArray) {
        if (intArray.size() == 0) {
            intArrayList.add(new ArrayList<>(currentArray));
            return;
        }
        for (int i = 0; i < intArray.size(); i++) {
            List<Integer> newCurrArr = new ArrayList<>(currentArray);
            newCurrArr.add(intArray.get(i));
            List<Integer> newArray = new ArrayList<>();
            for (int j = 0; j < intArray.size(); j++) {
                if (j != i) {
                    newArray.add(intArray.get(j));
                }
            }
            permutations(newArray, intArrayList, newCurrArr);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> intArrayList = new ArrayList<>();
        List<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            intArray.add(nums[i]);
        }
        List<Integer> currentArray = new ArrayList<>();
        permutations(intArray, intArrayList, currentArray);
        return intArrayList;
    }
}
