public class ArraySort {
    public static void main(String[] args) {
        int[] a={23,32,45,34,12,21,3233,34};
        int[] temp1=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])//bubble sort
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("sorted elements are ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        //implementing remove duplicate elements in array
        int j=0;
    for(int i=0;i<a.length-1;i++)
    {
        if(a[i]!=a[i+1])
        {
            temp1[j++]=a[i];
        }
    }
    temp1[j++]=a[a.length-1];
    for(int i=0;i<j;i++)
    {
        a[i]=temp1[i];
    }
   
    System.out.println("remove duplicate elements");
    for(int i=0;i<j;i++)
    {
        System.out.println(a[i]);
    }
    }
}
