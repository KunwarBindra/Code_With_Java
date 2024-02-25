package Neetcode150;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

// A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

// Example 1:

// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
// Example 2:

// Input: digits = ""
// Output: []
// Example 3:

// Input: digits = "2"
// Output: ["a","b","c"]

class Solution {
    public static String arr[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public void combination(int idx, String inputStr, String newStr, List<String> stringList) {
        if (idx == inputStr.length()) {
            stringList.add(newStr);
            return;
        }
        String mapping = arr[inputStr.charAt(idx) - '2'];
        for (int i = 0; i < mapping.length(); i++) {
            combination(idx + 1, inputStr, newStr + mapping.charAt(i), stringList);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> stringList = new ArrayList<>();
        String newStr = "";
        if (!digits.isEmpty()) {
            combination(0, digits, newStr, stringList);
        }
        return stringList;
    }
}
