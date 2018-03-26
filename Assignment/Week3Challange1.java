import java.util.concurrent.BlockingQueue;

class ConsumerThread extends Thread{
	 BlockingQueue queue;
	 int numberOfElements;
	 
	 ConsumerThread(BlockingQueue queue, int numberOfElements ){
		 this.queue = queue;
		 this.numberOfElements = numberOfElements;
	 }
}

class ProducerThread extends Thread{
	 BlockingQueue queue;
	 int numberOfElements;
	 
	 public void run() {
	      int value = 0;
	      for (int i = 0; i < 10; i++){
	    	  System.out.println("Enter the input: ");
	      }
	         
	      }
	 
	 ProducerThread(BlockingQueue queue, int numberOfElements ){
		 this.queue = queue;
		 this.numberOfElements = numberOfElements;
	 }
	
}

class week3ch1 {
	  public static void main(String args[]){  
		  BlockingQueue queue = null;
		 int numberOfElements = 0;

		  
		  ConsumerThread consumer = new ConsumerThread(queue, numberOfElements);
		  ProducerThread producer = new ProducerThread(queue, numberOfElements);
		  consumer.start();
		  producer.start();
	  }
	  
}
