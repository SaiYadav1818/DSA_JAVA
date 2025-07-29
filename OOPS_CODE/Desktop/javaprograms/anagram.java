/*from words to charcters and get it assici values(numbers) and sort it compare if both arrays are same are not.  */
import java.util.*;
class anagram {
    public static void main(String args[])
{
    int i,j;
Scanner sc =new Scanner(System.in);
String s1=sc.nextLine();
StringBuilder result = new StringBuilder();
String s2 =sc.nextLine();
int[] arr =new int[100];
int[] arr1 =new int[100];
int[] arr2 =new int[100];
int[] arr3 =new int[100];
for(i=0;i<s1.length();i++)
{
    char a = s1.charAt(i);
    int v= (int )a;
    arr[i]=v;
}/*covert ascii values to string */
for (int arrr : arr) {
    result.append((char) arrr);
}
String finalString = result.toString();
System.out.println(finalString); 
for(i=0;i<s1.length();i++){
for(j=0;j<s1.length();j++)
{
    if(arr[j]>arr[j+1])
    {
arr1[j]=arr[j];
arr[j]=arr[j+1];
arr[j+1]=arr1[j];
    }
}}

for(i=0;i<s2.length();i++)
{
    char a = s2.charAt(i);
    int v= (int )a;
    arr2[i]=v;
}
for(i=0;i<s2.length();i++){
for(j=0;j<s2.length();j++)
{
    if(arr2[j]>arr2[j+1])
    {
arr3[j]=arr2[j];
arr2[j]=arr2[j+1];
arr2[j+1]=arr3[j];
    }
}}
if(s1.length()==s2.length())
{
  
        if(Arrays.equals(arr3, arr1))
        {
            System.out.println("anagram ");
        }
        else
        {
            System.out.println("not anagram ");
        }
    
}
else {
    System.out.println("not anagram because string length is not same");
}
}
}
