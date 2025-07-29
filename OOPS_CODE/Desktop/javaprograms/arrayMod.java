import java.util.Scanner;

public class arrayMod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[5][5];
      
for(int i=0;i<5;i++)
{
  String str=sc.next();
  for(int j=0;j<5;j++) 
  {
    a[i][j]=Character.getNumericValue(str.charAt(j));
  }
}
for(int i=0;i<5;i++)
{
  for(int j=0;j<5;j++)
  {
   
    if(a[i][j]==1)
    {
        a[i][j]=0;
    }
    else{
        a[i][j]=1;
    }
}
  }

for(int i=0;i<5;i++)
{
    for(int j=0;j<5;j++)
    {
        System.out.print(a[i][j]);
    }
System.out.println();
}
    }
}
