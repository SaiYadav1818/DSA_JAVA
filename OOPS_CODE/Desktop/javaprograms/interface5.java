interface ExtraLarge{
	String extra = "This is extra-large";
      void display();
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
 
class Medium extends Large {
    public void Print() {
    	   super.Print();  
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print(); 
        System.out.println("This is small");
    }
  }
class  interface5 implements ExtraLarge{
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
		interface5 q = new interface5();
		q.display();
    }
	public void display(){
		System.out.print(extra);
	}
}
