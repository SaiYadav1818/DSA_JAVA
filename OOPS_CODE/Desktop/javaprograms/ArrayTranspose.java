import java.util.*;
public class ArrayTranspose {
 public static void main(String[] args) {
    int row=5,col=3;
    int a[][] = new int[row][col];
    int tran[][]=new int[col][row];
    Scanner sc =new Scanner(System.in);
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
 } 
for(int i=0;i<row;i++)
{
    for(int j=0;j<col;j++)
    {
        tran[j][i]=a[i][j];
    }
}

for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
{System.out.print(tran[i][j]+" ");
}
System.out.println();
 } 
}
}
