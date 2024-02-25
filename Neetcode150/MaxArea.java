package Neetcode150;

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

 

// Example 1:


// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

class Solution {
    public int maxArea(int[] height) {
        int currentArea = 0;
        int maxArea = 0;
        // brute force technique
        // for (int i = 0; i < height.length; i++) {
        // for (int j = i + 1; j < height.length; j++) {
        // int minheight = Math.min(height[i], height[j]);
        // int base = j - i;
        // currentArea = base * minheight;
        // if (currentArea > maxArea) {
        // maxArea = currentArea;
        // }
        // }
        // }

        // 2 pointers approach
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int minheight = Math.min(height[left], height[right]);
            int base = right - left;
            currentArea = base * minheight;
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

// why do we always move the pointer of the smallest pillar?

// The reason for this is simple. There is no reason to hang onto the pillar of
// the smallest size in
// the current range because in the next iteration, the overall width will
// decrease by one.
// Thus, a potential greater area will never be reached by hanging onto the
// smaller pillar,
// because even if another taller pillar is found by moving the pointer at the
// taller pillar,
// the area must always be calculated with the minimum of the two pillars.
// Due to the smaller width by decreasing the pointer range, the overall area
// will be smaller regardless.
// Thus, we can safely disregard the smaller pillar at each iteration.
