package com.bh.sub.thread;

public class Consumer implements Runnable{

	private String consumer;
    private Storage storage;
	
    
	public Consumer() {
		super();
	}
	
	

	public Consumer(String consumer, Storage storage) {
		super();
		this.consumer = consumer;
		this.storage = storage;
	}



	@Override
	public void run() {
		while(true) {
			storage.consume(consumer);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
