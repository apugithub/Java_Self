import java.util.concurrent.BlockingQueue;

class ConsumerThread extends Thread{
	 BlockingQueue queue;
	 int numberOfElements;
	 
	 ConsumerThread(BlockingQueue queue, int numberOfElements ){
		 
	 }
}

class ProducerThread extends Thread{
	 BlockingQueue queue;
	 int numberOfElements;
	 
	 ProducerThread(BlockingQueue queue, int numberOfElements ){
		 
	 }
	
}

class week3ch1 {
	  public static void main(String args[]){  
		  BlockingQueue queue;
		 int numberOfElements;
		  
		  ConsumerThread consumer = new ConsumerThread(queue, numberOfElements);
	  }
	  
}
