package Neetcode150;
import java.util.*;

// Given a string s, partition s such that every 
// substring
//  of the partition is a 
// palindrome
// . Return all possible palindrome partitioning of s.

 

// Example 1:

// Input: s = "aab"
// Output: [["a","a","b"],["aa","b"]]
// Example 2:

// Input: s = "a"
// Output: [["a"]]

class Solution {
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public void findPalindromes(String s, List<List<String>> intArrayList, List<String> intArray, int startIdx) {
        if (startIdx == s.length()) {
            intArrayList.add(new ArrayList<>(intArray));
            return;
        }
        for (int i = startIdx; i < s.length(); i++) {
            String newStr = s.substring(startIdx, i + 1);
            System.out.println(newStr);
            if (isPalindrome(newStr)) {
                List<String> newCurrArr = new ArrayList<>(intArray);
                newCurrArr.add(newStr);
                findPalindromes(s, intArrayList, newCurrArr, i + 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> intArrayList = new ArrayList<>();
        List<String> intArray = new ArrayList<>();
        findPalindromes(s, intArrayList, intArray, 0);
        return intArrayList;
    }
}
