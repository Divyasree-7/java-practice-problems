/* LeetCode Problem
Problem 136: Single Number
Link: https://leetcode.com/problems/single-number/

Description:
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Examples:
Input: nums = [2,2,1]
Output: 1

Input: nums = [4,1,2,1,2]
Output: 4

Input: nums = [1]
Output: 1

Approach:
- Use XOR property:
  - a ^ a = 0
  - a ^ 0 = a
- XOR all numbers → duplicates cancel out, leaving only the single number.

*/

class SingleNumber {
    public static int singleNumber(int[] arr) {
        int res = 0;
        for (int num : arr) {
            res = res ^ num;  // XOR operation
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1};
        int[] arr2 = {4, 1, 2, 1, 2};
        int[] arr3 = {1};
        System.out.println("Single number in arr1: " + singleNumber(arr1));
        System.out.println("Single number in arr2: " + singleNumber(arr2));
        System.out.println("Single number in arr3: " + singleNumber(arr3)); 
    }
}
