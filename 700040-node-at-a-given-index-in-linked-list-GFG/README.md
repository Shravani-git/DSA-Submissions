# [Node at a given index in linked list](https://www.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1?page=2&category=Linked%20List&sortBy=submissions)
## Easy
Given the head of a Singly Linked List and an index, The task is to find the node at the given index(1-based index) of the linked list. If no such&nbsp;index exists then return -1.
Examples :
Input: LinkedList: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;7 , index = 3Output: 3
Explanation: The Node value at index 3 is 3.

Input: LinkedList: 19-&gt;28-&gt;37-&gt;46-&gt;55 , index = 6Output: -1Explanation: As number of nodes are less than k so there is no node at index 6 , therefore our answer is -1.
Expected Time Complexity: O(n)Expected Auxiliary Space: O(1)
Constraints:1 &lt;= number of nodes &lt;= 1051 &lt;= node-&gt;data , k &lt;= 105