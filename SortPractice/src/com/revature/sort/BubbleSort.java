package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int max = arr[0];
			int maxIndex = 0;
			for(int j = 0; j < arr.length - i; j++) {
				if(max < arr[j]) {
					max = arr[j];
					maxIndex = j;
				}
				if(j == arr.length - 1 - i) {
					arr[maxIndex] = arr[arr.length -1 -i];
					arr[arr.length - 1 - i] = max;
				}
			}
		}
	}
}
