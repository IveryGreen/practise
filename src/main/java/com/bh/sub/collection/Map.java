package com.bh.sub.collection;

import java.util.HashMap;
import java.util.Hashtable;

public class Map {
	
	//HashMap键可以空，HashTable不可以
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put(null, "null");
		System.out.println(map.get(null));
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put(null, "null");
		System.out.println(table.get(null));
	}
}
