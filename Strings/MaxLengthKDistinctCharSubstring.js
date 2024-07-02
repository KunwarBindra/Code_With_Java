/*
    Problem Name: Maximum length substring having all same characters after k changes

    Ram Bhaiya has a string consisting of only 'a' and 'b' as the characters.
    Ram Bhaiya describes perfectness of a string as the maximum length substring of equal characters.
    Ram Bhaiya is given a number k which denotes the maximum number of characters he can change.
    Find the maximum perfectness he can generate by changing no more than k characters.

    Input Format: The first line contains an integer denoting the value of K.
                  The next line contains a string having only ‘a’ and ‘b’ as the characters.

    Constraints: 2 ≤ N ≤ 10^6

    Output Format: A single integer denoting the maximum perfectness achievable.

    Sample Input: 2
                  abba

    Sample Output: 4

    Explanation: We can swap the a's to b using the 2 swaps and obtain the string "bbbb".
                 This would have all the b's and hence the answer 4.
                 Alternatively, we can also swap the b's to make "aaaa".
                 The final answer remains the same for both cases.
*/

const longestKSubstr = (s, k) => {
  let windowObj = {};
  let maxWindowSize = -1;
  let windowStart = 0;
  for (let windowEnd = 0; windowEnd < s.length; windowEnd++) {
    if (windowObj[s[windowEnd]]) {
      windowObj[s[windowEnd]] += 1;
    } else {
      windowObj[s[windowEnd]] = 1;
    }
    while (Object.keys(windowObj).length > k) {
      windowObj[s[windowStart]] -= 1;
      if (windowObj[s[windowStart]] === 0) delete windowObj[s[windowStart]];
      windowStart++;
    }
    if (Object.keys(windowObj).length === k) {
      maxWindowSize = Math.max(maxWindowSize, windowEnd - windowStart + 1);
    }
  }
  return maxWindowSize;
};
