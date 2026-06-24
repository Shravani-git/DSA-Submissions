# [Modular Node in Linked List](https://www.geeksforgeeks.org/problems/modular-node/1?page=1&category=Linked%20List&difficulty=Basic&status=unsolved&sortBy=submissions)
## Easy
Given the head of a Singly Linked List and a number k, find the data of the modular node of the linked list. If no such index is present return -1.

A modular node is defined as the last node in the linked list whose position is divisible by k (pos % k==0).&nbsp;

Note: 1-based position is followed, i.e., position of the first node is 1 and second node is 2.
Examples :
Input: head: 19-&gt;28-&gt;37-&gt;46-&gt;55, k = 2
Output: 46
Explanation: The position 4 is divisible by k. The node at this position is 46.
Input: head: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;7, k = 10 Output: -1
Explanation: No position is divisible by k as the max position is 7 only.
Constraints:1 &lt;= number of nodes &lt;= 1051 &lt;= node-&gt;data , k &lt;= 105