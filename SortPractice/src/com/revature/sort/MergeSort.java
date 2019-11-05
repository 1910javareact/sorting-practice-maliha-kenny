package com.revature.sort;

import java.util.Arrays;

public class MergeSort {
	
	public static void sort(int[] arr) {
		if(arr.length == 1) {
			return;
		}else if(arr.length == 2){
			if (arr[0] > arr[1]) {
				int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
				return;
			}
		}else {
			int[] leftArr = new int[arr.length/2];
			int[] rightArr = new int[arr.length - arr.length/2];
			
			for(int i = 0; i < arr.length/2; i++) {
				leftArr[i] = arr[i];
			}
			
			for(int i = arr.length/2; i < arr.length; i++) {
				rightArr[i - arr.length/2] = arr[i];
			}
				
			sort(leftArr);
			sort(rightArr);
			merge(arr, leftArr, rightArr);
		}
	}
	//Arrays.copyOfRange(arr, 0, arr.length/2);
	//Arrays.copyOfRange(arr, arr.length/2 + 1, arr.length - 1);
	private static void merge(int[] arr, int[] left, int[] right) {
		int l = 0;
		int r = 0;
		for (int i = 0; i < arr.length; i++) {
			if (r >= right.length || (l < left.length && left[l] < right[r])) {
				arr[i] = left[l];
				l++;
			}else{
				arr[i] = right[r];
				r++;
			}
		}
	}
}
