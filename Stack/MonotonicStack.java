package Stack;

import java.util.Stack;

public class MonotonicStack {
    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        
        // Traverse the array from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            // Remove elements from the stack that are smaller than the current element
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            
            // If the stack is empty, there is no greater element to the right
            // Otherwise, the top element of the stack is the next greater element
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            
            // Push the current element to the stack
            stack.push(nums[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1, 5, 7, 6};
        int[] result = nextGreaterElement(nums);

        System.out.println("Next greater elements:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + ": " + result[i]);
        }
    }
}
