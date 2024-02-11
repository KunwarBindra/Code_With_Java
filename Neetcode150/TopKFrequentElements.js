// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order. 

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]
 

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// k is in the range [1, the number of unique elements in the array].
// It is guaranteed that the answer is unique.


/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var conquer = function (nums, si, mid, ei) {
    let merged = [];
    let idx1 = si;
    let idx2 = mid + 1;
    let x = 0;

    while (idx1 <= mid && idx2 <= ei) {
        if (nums[idx1] <= nums[idx2]) {
            merged[x] = nums[idx1];
            x++;
            idx1++;
        } else {
            merged[x] = nums[idx2];
            x++;
            idx2++;
        }
    }

    while (idx1 <= mid) {
        merged[x] = nums[idx1];
        x++;
        idx1++;
    }

    while (idx2 <= ei) {
        merged[x] = nums[idx2];
        x++;
        idx2++;
    }

    for (let i = 0, j = si; i < merged.length; i++, j++) {
        nums[j] = merged[i];
    }
}

var divide = function (nums, si, ei) {
    if (si >= ei) {
        return;
    }
    let mid = si + (ei - si) / 2;
    divide(nums, si, mid);
    divide(nums, mid + 1, ei);
    conquer(nums, si, mid, ei);
}

var topKFrequent = function (nums, k) {
    let obj = {};
    nums.sort();
    // divide(nums, 0, nums.length-1);
    obj[nums[0]] = 1
    let result = [];
    for (let i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            obj[nums[i]] = 1;
        } else {
            obj[nums[i]] += 1;
        }
    }
    let objArr = Object.entries(obj);
    // using bubble sort to sort objArr nums, but we can use faster sorting method to decrease tc
    for (let i = 0; i < objArr.length - 1; i++) {
        for (let j = 0; j < objArr.length - i - 1; j++) {
            if (objArr[j][1] < objArr[j + 1][1]) {
                let temp = objArr[j];
                objArr[j] = objArr[j + 1];
                objArr[j + 1] = temp;
            }
        }
    }
    for (let i = 0; i < k; i++) {
        result.push(objArr[i][0]);
    }
    return result;
};