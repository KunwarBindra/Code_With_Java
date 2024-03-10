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
