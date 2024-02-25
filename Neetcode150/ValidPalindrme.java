package Neetcode150;

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '
                    && (('A' <= s.charAt(i) && s.charAt(i) <= 'Z') || ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
                            || ('0' <= s.charAt(i) && s.charAt(i) <= '9'))) {
                newStr.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int left = 0;
        int right = newStr.length() - 1;
        while (left <= right) {
            if (newStr.charAt(left) == newStr.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
