package com.bh.sub.thread;

public class Producer implements Runnable{

	private String producer;
    private Storage storage;

    
    public Producer() {
		super();
	}


	public Producer(String producer, Storage storage)
    {
    	this.producer = producer;
        this.storage = storage;
    }

	
	@Override
	public void run() {
		while(true) {
			storage.produce(producer);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
