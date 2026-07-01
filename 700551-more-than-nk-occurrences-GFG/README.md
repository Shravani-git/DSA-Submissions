# [More than n/k Occurrences](https://www.geeksforgeeks.org/problems/count-element-occurences/1?page=1&category=Arrays&difficulty=Basic,Easy&status=unsolved&sortBy=submissions)
## Easy
Given an array arr&nbsp;and an element k. The task is to find the count of elements in the array that appear more than n/k times and n is length of arr.
Examples :
Input: arr = [3, 1, 2, 2, 1, 2, 3, 3], k = 4
Output: 2
Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times.

Input: arr = [2, 3, 3, 2], k = 3
Output: 2
Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times. So the count of elements are 2.
Input: arr = [1, 4, 7, 7], k = 2
Output: 0
Explanation: In the given array, no element appears more than n/k times.
Constraints:1 &lt;= arr.size() &lt;= 1060 &lt;= arr[i] &lt;= 1081 &lt;= k &lt;= arr.size()