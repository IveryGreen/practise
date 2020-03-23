package com.bh.sub.arith;

import java.util.Arrays;
import org.junit.Test;

public class SortTest {

	private Sort sort = new Sort();
	private int[] sortNum = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

	@Test
	public void testBubbleSort() {
		sort.bubbleSort(sortNum);
		System.out.println(Arrays.toString(sortNum));
	}

	@Test
	public void testBubbleSort2() {
		sort.bubbleSort2(sortNum);
		System.out.println(Arrays.toString(sortNum));
	}

	@Test
	public void testSelectSort() {
		sort.selectSort(sortNum);
		System.out.println(Arrays.toString(sortNum));
	}

	@Test
	public void testInsertSort() {
		sort.insertSort(sortNum);
		System.out.println(Arrays.toString(sortNum));
	}

	@Test
	public void testQuickSort() {
		sort.quickSort(sortNum, 0, sortNum.length - 1);
		System.out.println(Arrays.toString(sortNum));
	}
}
