package mypackage;

public class Balance {
    String name;
    int bal;
  public  Balance(String str,int n)
    {
        name=str;
        bal=n;
    }
  public   void bank(){
    if(bal<500)
    {
        System.out.println(name+" "+"account is dead");
    }
    else
    {
        System.out.println(""+name+"balance "+bal);
    }
  } 
}
