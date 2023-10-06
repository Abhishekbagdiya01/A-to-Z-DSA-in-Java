<b>Linked List Questions</b>
This directory contains all the linked list questions and their descriptions that I have solved in Java.

<b>Questions</b> 
1. <b>Remove Duplicates from an Unsorted Linked List</b>
Write a method to remove duplicates from an unsorted linked list.

Example

      linkedList = 1->2->1->3
      deleteDups(linkedList)
      //Output
      1->2->3
      
2. <b>Return Nth to Last</b>
Implement and algorithm to find the nth to last element of a singly linked list.

Example

      linkedList = 1->2->3->4-5
      deleteDups(linkedList, 2)
      //Output
      4

3. <b>Partition</b>
Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x

Example

      Input: 1 -> 9 -> 5  -> 10 -> 2  [x=4]
      Output: 2 -> 1 -> 9 -> 5 -> 10

4. <b>Sum Lists</b>
You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.

Example

      list1 = 7 -> 1 -> 6
      list2 =  5 -> 9 -> 2
      result = 2 -> 1 -> 9

5. <b>Intersection</b>
Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.

<img src="https://img-c.udemycdn.com/redactor/raw/coding_exercise_instructions/2021-06-16_13-37-32-5cb611c0659849766757fcd9d7f8fe06.png">

Example

   ```
   LinkedList llA = new LinkedList();
   llA.insertNode(3);
   llA.insertNode(1);
   llA.insertNode(5);
   llA.insertNode(9);
   LinkedList llB = new LinkedList();
   llB.insertNode(2);
   llB.insertNode(4);
   llB.insertNode(6);
   Exercise ex = new Exercise();
   ex.addSameNode(llA, llB, 7);
   ex.addSameNode(llA, llB, 2);
   ex.addSameNode(llA, llB, 1);
   Node inter = ex.findIntersection(llA, llB);
   System.out.println(inter.value);
 
   output  7
   ```


<b>Conclusion</b>
This directory contains all the linked list questions and their descriptions that I have solved in Java. I hope this is helpful for anyone who is learning about linked lists or who needs help solving linked list problems.
