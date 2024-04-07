package Neetcode150;

// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

// Example 1:


// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9

class Solution {
    public int trap(int[] height) {
        int leftAux[] = new int[height.length];
        leftAux[0] = height[0];
        int rightAux[] = new int[height.length];
        rightAux[height.length - 1] = height[height.length - 1];
        int totalWater = 0;
        for (int i = 1; i < height.length; i++) {
            leftAux[i] = Math.max(leftAux[i - 1], height[i]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            rightAux[i] = Math.max(rightAux[i + 1], height[i]);
        }
        for (int i = 0; i < height.length; i++) {
            totalWater = totalWater + (Math.min(leftAux[i], rightAux[i]) - height[i]);
        }
        return totalWater;
    }
}
