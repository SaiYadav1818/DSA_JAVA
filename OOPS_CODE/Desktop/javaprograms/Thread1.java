class Thread1 extends Thread{
    public void run()
    {
     System.out.println("Thread is Running.");
    }
    public static void main(String args[]){  

		// Creating object of thread class
		Thread1 thread=new Thread1();  

                // Start the thread
		thread.start();
	}  
}
