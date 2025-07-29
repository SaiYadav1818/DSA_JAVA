public class Array2 {
    public static void main(String[] args) {
        int[] a={1,2,4,5};
        System.out.print("[");
        for(int i=0;i<a.length;i++)
        {
System.out.print(a[i]);
if(i<a.length-1)
{
    System.out.print(",");
}
        }
        System.err.print("]");
    }
}
