package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SolutionB {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = scan.nextInt();
        System.out.println("Enter element to search");
        int key=scan.nextInt();
        System.out.println("Enter "+size+" elements in ascending order");
        int[] inputArray = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            inputArray[i] = scan.nextInt();
        }
        IntStream numbersFromInputArray= Arrays.stream(inputArray);//converts the array into a stream
        int Length=(int)numbersFromInputArray.count()-1;//counts the elements in the stream
        int index = RecursiveBinarySearch(inputArray,key,Length);
        if (index != -1) {
            System.out.println("Element found at index :" + index);
        } else {
            System.out.println("NOT_FOUND");
        }
    }
    public static int RecursiveBinarySearch(int[] sortedArray,int key,int length) {
        int start=1;
        int end=length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key==sortedArray[mid]) {
                return mid;//base case for recursive binary search method
            } else if (key < sortedArray[mid]) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }
}

























