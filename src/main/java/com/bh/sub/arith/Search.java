package com.bh.sub.arith;

public class Search {

	public int sequentialSearch(int[] arr, int key) {
		int index = arr.length - 1;
		int temp = arr[0];
		arr[0] = key;// 将下标为0的数组元素设置为哨兵
		while (arr[index] != key) {
			index--;
		}
		if(index == 0) {
			if(temp == key) {
				return 0;
			}else {
				return -1;
			}
		}
		arr[0] = temp;
		return index;
	}

	/**
	 * 二分查找
	 * 
	 * @param arr
	 * @param des
	 * @return
	 */
	public int binarySearch(int[] arr, int des) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (des == arr[mid]) {
				return mid;
			} else if (des < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
