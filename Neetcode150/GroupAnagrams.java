// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2:

// Input: strs = [""]
// Output: [[""]]
// Example 3:

// Input: strs = ["a"]
// Output: [["a"]]

package Neetcode150;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramList = new ArrayList<>();
        List<String> sortedStringList = new ArrayList<>();
        boolean isVisited[] = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedString = String.valueOf(arr);
            sortedStringList.add(sortedString);
        }
        for (int i = 0; i < strs.length; i++) {
            List<String> currentList = new ArrayList<>();
            if (!isVisited[i]) {
                currentList.add(strs[i]);
            }
            for (int j = i + 1; j < strs.length; j++) {
                if (sortedStringList.get(i).compareTo(sortedStringList.get(j)) == 0 && !isVisited[j]) {
                    currentList.add(strs[j]);
                    isVisited[j] = true;
                }
            }
            anagramList.add(currentList);
        }
        List<List<String>> updatedAnagramList = new ArrayList<>();
        for (int i = 0; i < anagramList.size(); i++) {
            if (anagramList.get(i).size() > 0) {
                updatedAnagramList.add(anagramList.get(i));
            }
        }
        return updatedAnagramList;
    }
}
