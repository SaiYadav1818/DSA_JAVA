public class FindMissingNum {
    public static void main(String[] args) {
     int n=10;
     int k=0;
     int[] a={1,2,3,4,5,7,6,9,10};
   int sumofnaturalnum=n*(n+1)/2;
   for(int i=0;i<a.length;i++)

   {
    k=k+a[i];
   }
   int miss=sumofnaturalnum-k;
   System.out.println("missimg number is"+miss);
}}