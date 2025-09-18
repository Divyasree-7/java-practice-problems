/* LeetCode Problem
Problem 9: Palindrome Number
Link: https://leetcode.com/problems/palindrome-number/

Description:
Given an integer x, return true if x is a palindrome, and false otherwise.
An integer is a palindrome when it reads the same backward as forward.

Examples:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Negative numbers are not palindromes.

Approach:
- If x < 0 → return false (negative numbers are never palindromes).
- Reverse the number and compare with the original.
*/

import java.util.Scanner;
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // negative numbers are not palindromes
        int temp = x;
        int rev = 0;
        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev == temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        PalindromeNumber sol = new PalindromeNumber();
        System.out.println("Is Palindrome: " + sol.isPalindrome(x));
    }
}
