package com.bh.sub.arith;

public class Sort {

	/**
	 * 冒泡排序
	 * 
	 * @param arr
	 */
	public void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	/**
	 * 冒泡排序优化版，如果有一次没有交换，说明已经排序好
	 * 
	 * @param sortNum
	 */
	public void bubbleSort2(int[] sortNum) {
		boolean flag = true;
//		while (flag) {
			
			for (int i = 0; i < sortNum.length - 1; i++) { // 第一个for循环控制排序要走多少趟，最多做n-1趟排序
				flag = false;
				for (int j = 0; j < sortNum.length - 1 - i; j++) { // 第2个for循环控制每趟比较多少次
					if (sortNum[j + 1] < sortNum[j]) { // 大的往后面排
						swap(sortNum, j, j + 1);
						flag = true;
					}
				}
				// 优化判断
				if (!flag) {// 若没有交换则排序完成，直接跳出
					break;
				}
			}
//		}
	}

	/**
	 * 选择排序
	 * 
	 * @param arr
	 */
	public void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int k = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[k]) {
					k = j;
				}
			}
			if (k != i) {
				swap(arr, i, k);
			}
		}
	}

	/**
	 * 插入排序
	 * 
	 * @param arr
	 */
	public void insertSort(int[] arr) {
		int temp, i, j;
		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

	/**
	 * 快速排序
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 */
	public void quickSort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int i = low;
		int j = high;
		int temp = arr[low];
		while (i < j) {
			while (i < j && arr[j] > temp) {
				j--;
			}
			if (i < j) {
				arr[i++] = arr[j];
			}
			while (i < j && arr[i] < temp) {
				i++;
			}
			if (i < j) {
				arr[j--] = arr[i];
			}
		}
		arr[i] = temp;
		quickSort(arr, low, i - 1);
		quickSort(arr, i + 1, high);
	}

	private void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
}
