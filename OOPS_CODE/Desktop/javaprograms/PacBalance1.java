import mypackage.Balance;
public class PacBalance1 {
    public static void main(String[] args) {
Balance obj[] = new Balance[3];
       /* Balance obj= new Balance("sai",1000);
obj.bank();*/
obj[0]=new Balance("sai", 1000);
obj[1]=new Balance("raju", 300);
obj[2]=new Balance("shashank", 900);
for(int i=0;i<3;i++)
{
    obj[i].bank();
}

    }
}
