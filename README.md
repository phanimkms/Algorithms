# Algorithms
A program has been developed to address a given problem statement

Problem Statement

Applying the knowledge of search algorithms on a simple scenario described by the problem statement below.

Part A:

You are given an array of integers that represents the IDs of the users that have registered in “UpgradBook,” a private social network created for all the students who have graduated from Upgrads’ programs.

The array of integers has the following properties:

With a known length N

The array is sorted in an ascending order

The array holds distinct integers (i.e. there are no repeating numbers)

The array is 1-indexed, i.e. the first element is stored in A[1] (not A[0])

Find the first positive integer M (where 1 <= M <= N) such that when M is used as the array index, the result from the array is the the integer M itself. i.e. A[M] = M

In other words, find the first positive integer M where M is both a user’s ID and its index in the array of user ids.

Write a program to find M, if it exists, in O(log N) time. If M does not exist, please return NOT_FOUND

Please note that the code takes two inputs:

First one being the size of the array

Second one being the elements inside the array

So, to input an array having 5 elements, the first input will be 5 and the next 5 inputs will be the elements of the array.

----------------------------------
Part B:

You are given an array of integers that represents the IDs of the users that have registered in “UpgradBook.”

The array of integers have the following properties:

The array is sorted is an ascending order

The array holds distinct integers (i.e. there are no repeating numbers)

The array is 1-indexed, i.e. the first element is stored in A[1] (not A[0])

However the length of the array, N, is unknown (i.e. you don’t know how long the array is and arrayName.length is not available to you). In short, you can not use the length of the array to apply binary search

Since the length of the array is unknown, an error “ArrayIndexOutOfBoundsException” is returned if you try to index into the array with an integer greater than N.

Find a function to find positive integer M in the array A and write a program to find M (if M exists) in O(log N) time.

If M exists, please print the index of M using System.out.println().

If M does not exist, please print the String "NOT_FOUND" using System.out.println().

---------------------------
Test Cases
Part A :
In this part of the problem you are supposed to find an element whose value is equal to its index. The code should print first such instance in the array.
Sample Input:
5
0 1 3 4 5
Sample Output:
3
In this case 5 is the size of the array.
0 1 3 4 5 are the elements of the array where the element 0 is at index 1 and not at index 0. So we effectively do not use the index 0 of the array and start filling the array from index 1 only.
Output is 3 because at index 3 the value of the element is 3 only. Though at index 5, the value of the element is also 5 but the code should print first such occurrence.
One more test case is given below
Input :
7
0 1 2 4 5 6 7
Output :
4

-----------------------

Part B:
In this part of the problem, we are not supposed to look for A[M]= M
We must enter the value we are looking to search for as an input.
Also, you are not supposed to use the size of the array to apply binary search. Though you will input the array yourself, and you will be knowing its size , but you can not use the size for applying binary search for Part B of the problem.
So, the first input will be the size of the array. Second input will be the key you are looking to search for and at last you input the elements of the array.
Input :
10 -  This corresponds to the size of the array.
6 -  This corresponds to the key you are searching for
1 2 3 5 6 7 8 9 10 11 - These are the elements of the array
Output :
5 - Output should be the index at which the key is present. In this case, key 6 is present at index 5 of 1-INDEXED array. So the output is 5.
Input:
20
20
1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
Output :
19

 --------------
 
Yes, the program would know the length of the array if the array elements are hard coded. However, this problem attempts to simulate a big data scenario -- a scenario where the number of elements in the array is so big that it won't fit in memory all at once. Therefore, since the Array won't fit in memory, it would be difficult for us to figure out exactly the length of the array.

 


