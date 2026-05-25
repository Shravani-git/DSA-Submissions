# [Union of Two Linked Lists](https://www.geeksforgeeks.org/problems/union-of-two-linked-list/1?page=3&category=Linked%20List&sortBy=submissions)
## Medium
Given two singly linked lists, create a new linked list that contains the union of elements present in both lists. Each element should appear only once in the resulting list (no duplicates allowed).The order of elements in the resulting list should be:

 First, include elements from the first list in the order they appear. 
 Then include elements from the second list that were not already included, in their original order.

Examples:
Input: head1 = 9-&gt;6-&gt;4-&gt;2-&gt;3-&gt;8, head2 = 1-&gt;2-&gt;8-&gt;6-&gt;2Output: 9 -&gt; 6 -&gt; 4 -&gt; 3 -&gt; 8 -&gt; 1 -&gt; 2Explanation: All the distinct numbers from two lists. 
Input: head1 = 1-&gt;5-&gt;1-&gt;2-&gt;2-&gt;5, head2 = 4-&gt;5-&gt;6-&gt;7-&gt;1 Output: 1 -&gt; 5 -&gt; 2 -&gt; 4 -&gt; 6 -&gt; 7Explaination: All the distinct numbers from two lists.
Constraints:1 ≤ size of both linked lists&nbsp;≤ 1051 ≤&nbsp;data of nodes ≤ 105