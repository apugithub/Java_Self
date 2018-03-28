import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ConsumerThread extends Thread{
	 BlockingQueue queue;
	 int numberOfElements;
	 
	 ConsumerThread(BlockingQueue queue, int numberOfElements ){
		 this.queue = queue;
		 this.numberOfElements = numberOfElements;
	 }
	 
	 public void run() {
	      int value = 0;
	      try {
	    	  for (int i=0 ; i< numberOfElements; i++)
	    	  System.out.println("Consume value: "+queue.take());
			
		} catch (InterruptedException  e) {
			e.printStackTrace();
		}

	         
	 }
	 
 }
////////////////////////////////////////////////////////////////////////////
class ProducerThread extends Thread{
	 BlockingQueue queue;
	 int numberOfElements;
	 
	 
	 ProducerThread(BlockingQueue queue, int numberOfElements ){
		 this.queue = queue;
		 this.numberOfElements = numberOfElements;
	 }
	
	 public void run() {
	      int value = 0;
	      try {
	    	  for (int i=0 ; i< numberOfElements; i++)
	    		  queue.put(i);
			
		} catch (InterruptedException  e) {
			e.printStackTrace();
		}

	         
	      }
}

class week3challange1 {
	  public static void main(String args[]){  
		  BlockingQueue queue = new ArrayBlockingQueue<>(1024);
		 //int numberOfElements = 0;
		 
		 Scanner bucky = new Scanner(System.in);
		 int numberOfElements = bucky.nextInt();

		  
		  ConsumerThread consumer = new ConsumerThread(queue, numberOfElements);
		  ProducerThread producer = new ProducerThread(queue, numberOfElements);
		  consumer.start();
		  producer.start();
	  }
	  
}