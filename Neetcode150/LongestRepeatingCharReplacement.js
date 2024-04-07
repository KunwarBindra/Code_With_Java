// You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

// Return the length of the longest substring containing the same letter you can get after performing the above operations.

 

// Example 1:

// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.
// Example 2:

// Input: s = "AABABBA", k = 1
// Output: 4
// Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
// The substring "BBBB" has the longest repeating letters, which is 4.
// There may exists other ways to achieve this answer too.

/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var characterReplacement = function (s, k) {
    let obj = {}
    let topFrequency = 0
    let longest = 0
    let start = 0
    for (let end = 0; end < s.length; end++) {
        if (obj[s[end]]) {
            obj[s[end]] += 1
        } else {
            obj[s[end]] = 1
        }
        topFrequency = Math.max(topFrequency, obj[s[end]])
        while ((end - start + 1) - topFrequency > k) {
            obj[s[start]] -= 1
            if (obj[s[start]] === 0) delete obj[s[start]];
            start++
        }
        longest = Math.max(longest, end - start + 1)
    }
    return longest
};
