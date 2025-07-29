import java.util.*;


public class StopUserInput{
public static void main(String[] args) {
String choice = "";
Scanner input = new Scanner(System.in);
String a[]=new String[50];
int b[]= new int[50];
int pro=1;
int sum=0;
int i=0;
while (input.hasNextInt())
{
  a[i]=input.next();
  i++;
}
for(int j=0;j<i;j++)
{
b[j]=Integer.parseInt(a[j]);
}
for(int j=0;j<i;j++)
{
  sum=b[j]+sum;
  pro=b[j]*pro;
  
}
System.out.println("Product is: " +pro);
System.out.println("Average is: " +(float)sum/i);
}

}