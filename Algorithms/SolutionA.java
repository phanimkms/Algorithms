package com.company;

import java.util.Scanner;

public class SolutionA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] inputArray = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            inputArray[i] = scan.nextInt();
        }
        int index = customRecursiveBinarySearch(inputArray, 1, inputArray.length - 1);
        if (index != -1) {
            System.out.println("First Occurrence :" + index);//Prints the index at first occurrence of A[M]=M in an array of size N such that 1<=M<=N
        } else {
            System.out.println("NOT_FOUND");//Prints message when no occurrence of A[M]=M found
        }
    }
    public static int customRecursiveBinarySearch(int[] sortedArray, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (sortedArray[1] == 1) {
                return 1;//Base case 1:returns 1 when A[1]=1
            } else if (sortedArray[mid] == mid) {
                return mid;//Base case 2: returns M when A[M]=M and A[X]!=X such that 1<=X<=M
            } else if (sortedArray[mid] == mid && sortedArray[mid - 1] == (mid - 1)) {
                return mid - 1;//Base case 3:returns M-1 when A[M]=M && A[M-1]=M-1
            } else if (mid < sortedArray[mid]) {
                return customRecursiveBinarySearch(sortedArray, start, mid-1);
            } else {
                return customRecursiveBinarySearch(sortedArray, mid + 1, end);
            }
        }
        return -1;
    }

}
























