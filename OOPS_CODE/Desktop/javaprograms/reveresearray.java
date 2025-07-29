public class reveresearray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int[] b=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--)
        {
            a[j]=a[i];
            j+=1;
        }
System.out.println(a);
    }
}
