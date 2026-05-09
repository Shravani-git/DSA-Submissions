# [Elements before which no element is bigger](https://www.geeksforgeeks.org/problems/elements-before-which-no-element-is-bigger0602/1?page=1&sortBy=difficulty)
## Easy
You are given an array arr[] of integers. Your task is to find the count of elements before which all the elements are smaller. The first element is always counted as there are no elements before it.
Examples:
Input: arr[] = [10, 40, 23, 35, 50, 7]Output: 3Explanation: The elements 10, 40, and 50 are such that all preceding elements are smaller. Thus, the count is 3.
Input: arr[] = [5, 4, 1]Output: 1Explanation: Only the first element 5 is such that all preceding elements (none in this case) are smaller. Thus, the count is 1.
Expected Time Complexity: O(n)Expected Auxiliary Space: O(1)
Constraints:
1 ≤ arr.size() ≤ 10^61 ≤ arr[i] ≤ 10^9