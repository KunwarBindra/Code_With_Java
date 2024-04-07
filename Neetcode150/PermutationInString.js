// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

 

// Example 1:

// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").
// Example 2:

// Input: s1 = "ab", s2 = "eidboaoo"
// Output: false

/**
 * @param {string} s1
 * @param {string} s2
 * @return {boolean}
 */
var checkInclusion = function (s1, s2) {
    let s1Obj = {}
    for (let i = 0; i < s1.length; i++) {
        s1Obj[s1[i]] = s1Obj[s1[i]] ? s1Obj[s1[i]] + 1 : 1
    }
    let s2Obj = {}
    let start = 0
    for (let end = 0; end < s2.length; end++) {
        s2Obj[s2[end]] = s2Obj[s2[end]] ? s2Obj[s2[end]] + 1 : 1
        if (end - start === s1.length - 1) {

            // using Object prototype functions

            // let s1ObjArr = Object.entries(s1Obj).sort()
            // let sortedS1Obj = Object.fromEntries(s1ObjArr)
            // let s2ObjArr = Object.entries(s2Obj).sort()
            // let sortedS2Obj = Object.fromEntries(s2ObjArr)
            // if (JSON.stringify(sortedS1Obj) === JSON.stringify(sortedS2Obj)) {
            //     return true
            // }

            // using lodash comparator function

            if (_.isEqual(s1Obj, s2Obj)) {
                return true
            }
            s2Obj[s2[start]] -= 1
            if (s2Obj[s2[start]] === 0) delete s2Obj[s2[start]]
            start++
        }
    }
    return false
}