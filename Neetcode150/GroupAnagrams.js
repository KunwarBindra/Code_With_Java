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


/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function (strs) {
    let obj = {};
    for (let i = 0; i < strs.length; i++) {
        let sortedString = strs[i]?.split('')?.sort()?.join('');
        if (obj[sortedString]) {
            obj[sortedString].push(strs[i]);
        } else {
            obj[sortedString] = [strs[i]];
        }
    }
    let objArr = Object.entries(obj);
    let finalArr = [];
    for (let i = 0; i < objArr.length; i++) {
        finalArr.push(objArr[i][1]);
    }
    return finalArr;
};