package com.bh.sub.arith;

import org.junit.Test;

public class SearchTest {

	private int arr[]={4, 5, 12, 13, 15, 17, 18, 23, 25, 27, 34, 34, 35, 38, 49, 49, 51, 53, 54, 56, 62, 64, 65, 76, 78, 97, 98, 99};  
	private Search search = new Search();
	
	@Test
	public void binarySearch() {
		System.out.println(search.binarySearch(arr, 65));
	}

	@Test
	public void sequentialSearch() {
		System.out.println(search.sequentialSearch(arr, 65));
		System.out.println(search.sequentialSearch(arr, 4));
		System.out.println(search.sequentialSearch(arr, 4));
		System.out.println(search.sequentialSearch(arr, 2));
	}
}
