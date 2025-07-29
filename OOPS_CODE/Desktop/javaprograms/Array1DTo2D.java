import java.util.*;
public class Array1DTo2D {
    public static void main(String[] args) {
        int index=0;
        Scanner sc = new Scanner(System.in);
    
        int a[] = new int[7];
        int b[][] = new int[4][3];
        for(int i=0;i<7;i++)
        {
a[i]=sc.nextInt();
        }
for(int i=0;i<4;i++)
{
for(int j=0;j<2;j++)
{
    if(index<a.length){
    b[i][j]=a[index++];}
    
else
{
    b[i][j]=0;
}}
}
for(int i=0;i<4;i++)
{
for(int j=0;j<2;j++)
{
    System.out.print(b[i][j]+" ");
}
System.out.println();
}

    }
}
