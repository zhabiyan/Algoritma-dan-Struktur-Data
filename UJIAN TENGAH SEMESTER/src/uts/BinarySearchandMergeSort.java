/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Zhabiyan
 */
public class BinarySearchandMergeSort {

    public void sort(int data[]) {
        int a = data.length;
        for (int i = 0; i < a - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < a; j++) {
                if (data[j] < data[idxMin]) {
                    idxMin = j;
                }
            }
            int temp = data[idxMin];
            data[idxMin] = data[i];
            data[i] = temp;
        }
    }

    public void printArray(int data[]) {
        int n = data.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int FindBinarySearch(int data[], int left, int right, int z) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (data[mid] == z) {
                return mid;
            }
            if (data[mid] > z) {
                return FindBinarySearch(data, left, mid - 1, z);
            }
            return FindBinarySearch(data, mid + 1, right, z);
        }
        return -1;
    }
}
