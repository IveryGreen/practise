package com.bh.sub.thread;

import static org.junit.Assert.*;

import org.junit.Test;

public class StorageTest {
	
	@Test
	public void test() {
		Storage storage = new Storage();
		for(int i = 0; i < 3; i++) {
			new Thread(new Producer("生产者"+i, storage)).start();
		}
		
		for(int j = 0; j < 5; j++) {
			new Thread(new Consumer("消费者"+j, storage)).start();
		}
	}

}
