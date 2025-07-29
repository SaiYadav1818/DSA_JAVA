class thread7 extends Thread{  
    public void run(){  
      System.out.print("Thread is running.");  
    }  
   public static void main(String args[]){  
      thread7 t=new thread7();  
      System.out.println("Name of thread 't':"+ t.getName());
      t.setName("NPTEL");
      t.start();
      System.out.println("New name of thread 't':"+ t.getName());  
 }  
}