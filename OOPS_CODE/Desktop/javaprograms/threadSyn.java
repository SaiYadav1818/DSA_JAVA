class Execute{
// fix the code below to get the desired output
synchronized void print(int n){
    for(int i=1;i<=5;i++){  
      System.out.println(n*i);  
      try{  
       Thread.sleep(400);  
      }catch(Exception e){
         System.out.println(e);
      }  
    }
  }}
  class Thread1 extends Thread{  
	Execute t1;  
	Thread1(Execute t){  
		t1=t;  
	}  
	public void run(){  
		t1.print(5);  
	} 
}  

class Thread2 extends Thread{  
	Execute t;  
	Thread2(Execute t){  
		this.t=t;  
	}  
	public void run(){  
		t.print(10);  
	}  
}  
  
public class threadSyn{  
	public static void main(String args[]){  
		Execute obj = new Execute();//only one object  
		Thread1 t1=new Thread1(obj);  
		Thread2 t2=new Thread2(obj);  
		t1.start();  
		t2.start();  
	}  
}