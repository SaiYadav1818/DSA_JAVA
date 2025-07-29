import java.util.Scanner;

public class ArrSumValue {

 public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
        int a[]=new int[40];
        int sum;
        int b[]=new int[40];
        for(int i=0;i<7;i++)
        {
a[i]=sc.nextInt();
        }
        System.out.println("next array");
        for(int i=0;i<5;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++){
            for(int j=i+1;j<7;j++){
     sum=a[i]+a[j];
     for(int k=0;k<7;k++){
     if(sum==b[k])
     {
System.out.println(b[k]);
     }}
        }
 } 

}  
}
/*. Given an array of integers and a value, determine if there are any two integers in the array 
whose sum is equal to the given value. Print the values in list or array format if found. 
Input format: 
The first line contains an integer Array. 
The second line contains an array of values
Example 1: 
Array1 : [5, 7, 1, 2, 8, 4, 3] 
Value : [3, 20, 1, 2, 7] 
Output: 
[3,7] */