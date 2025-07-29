import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int[] a=new int[5];
       // int[] array = {1, 2, 3, 4, 5};
        Scanner sc=new Scanner(System.in);
      a[0]=2;
      a[1]=3;
      a[2]=4;
      a[3]=5;
      a[4]=6;
     System.out.println(Arrays.toString(a)); 
String[] str=new String[4];
for(int i=0;i<str.length;i++)
{
    str[i]=sc.next();
}
str[0]="virat";//updating
System.out.println(Arrays.toString(str)); 
    }
}
