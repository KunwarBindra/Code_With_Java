// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109

package Neetcode150;
import java.util.ArrayList;

class Solution {
    public void conquer(int[] nums, int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

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

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            nums[j] = merged[i];
        }
    }

    public void divide(int[] nums, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(nums, si, mid);
        divide(nums, mid + 1, ei);
        conquer(nums, si, mid, ei);
    }

    public int longestConsecutive(int[] nums) {
        int currentLength = 0;
        int maxLength = 0;
        if (nums.length > 0) {
            divide(nums, 0, nums.length - 1);
            ArrayList<Integer> subsArr = new ArrayList<>();
            subsArr.add(nums[0]);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    subsArr.add(nums[i]);
                }
            }
            int incAux[] = new int[subsArr.size()];
            incAux[0] = 1;
            for (int i = 1; i < subsArr.size(); i++) {
                if (subsArr.get(i) == subsArr.get(i - 1) + 1) {
                    incAux[i] = incAux[i - 1] + 1;
                } else {
                    incAux[i] = 1;
                }
            }
            for (int i = 0; i < incAux.length; i++) {
                currentLength = incAux[i];
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
            return maxLength;
        } else {
            return maxLength;
        }
    }
}
