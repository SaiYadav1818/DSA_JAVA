import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        char[] a={'a','b','c','b','c','a','d'};
        Arrays.sort(a);
        char[] b=new char[100];
        int j=0;
        int count=1;
         b[j++]=a[0];
                for(int i=1;i<a.length-1;i++)
        {
            if(a[i]!=a[i-1]){
b[j++]=a[i];
count++;

             }     }
       b[j++]=a[a.length-1];
        count++;
        for(int k=0;k<count;k++)
        {
            System.out.println(b[k]);
        }
        System.out.println("the length of the array after removing duplicate elements"+count);
    }
    
}
