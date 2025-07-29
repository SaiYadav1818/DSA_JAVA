import java.util.Scanner;  
class Swastika1
{  
    // main() method start  
    public static void main (String[] args)  
    {  
        int rows, cols;  
        Scanner sc = new Scanner(System.in);  
   
        rows = sc.nextInt();  
    
        cols = sc.nextInt();  
   
        sc.close();  
            
        swastika(rows, cols);  
    }  
static void swastika(int rows, int cols)  
{
int rmid = rows/2 +1;
int cmid = cols/2 +1;
for ( int i = 1; i <= rows ; i++)
{
  for ( int j = 1; j <= cols ; j++ )
  {
    if ( i == rmid )
      System.out.print("*");
    else if ( j == cmid )
      System.out.print("*");
    else if ( j == 1 && i < rmid || j == cols && i > rmid)
      System.out.print("*");
    else if ( i == 1 && j > cmid || i == rows && j < cmid )
      System.out.print("*");
    else
      System.out.print(" ");
  }
  System.out.print("\n");
}
}
}
