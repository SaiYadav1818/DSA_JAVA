import java.util.*;
public class Floornum {
    public static void main(String[] args) {
        int[] a={1,4,5,7,2,0,12,25,65,78};
        int count=0;
        int count1=0;
        int[] b=new int[a.length];
        int[] c=new int[a.length];
        boolean flag=false;
        Arrays.sort(a);
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<a.length;i++)
{
if(a[i]==n)
{
    System.out.println("target number"+a[i]);
    flag=true;
    break;
   
}
else 
{
    if(a[i]<n)
{
 b[count1]=a[i]; 
 count1++;
}
else
{
    c[count]=a[i];
    count++;
}
}

}
if(flag==false){

    System.out.println("Lowest floor number"+b[count1-1]);
if(count>0)
{
    System.out.print("Biggest floor number"+c[0]);
}
}
/* 
for(int j=0;j<count;j++)
{
    System.out.println(c[j]);
}
for(int j=0;j<count1;j++)
{
    System.out.println(b[j]);
}*/
    }
}
