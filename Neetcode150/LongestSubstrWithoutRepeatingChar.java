// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

package Neetcode150;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int currentLength = 0;
        StringBuilder currentString = new StringBuilder();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (currentString.indexOf(currentChar.toString()) != -1) {
                int index = currentString.indexOf(currentChar.toString());
                currentString.delete(0, index+1);
            }
            currentString.append(s.charAt(i));
            currentLength = currentString.length();
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}
