package Neetcode150;

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int charArr[] = new int[256];
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                charArr[s.charAt(i)] += 1;
            }
            for (int i = 0; i < t.length(); i++) {
                if (charArr[t.charAt(i)] > 0) {
                    charArr[t.charAt(i)] = charArr[t.charAt(i)] - 1;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
