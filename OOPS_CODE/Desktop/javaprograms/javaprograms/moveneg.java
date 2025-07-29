public class moveneg {
    public static void main(String arfs[])
    {
        
       int[] arr={1 ,-1 ,3 ,2 ,-7 ,-5 ,11 ,6};
        int[] c=new int[10];
        int g=0;
        int i=0;
        int index=0;
        while(i<arr.length){
 if(arr[i]<0){
                c[g]=i;
                g++;
                i++;
            }
   else if(c.length!=0 && index<c.length && arr[i]>0 )
            {
                int temp=arr[i];
                arr[i]=arr[c[index]];
               arr[c[index]]=temp;
        
              index++;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<arr.length;k++)
        {
System.out.print(arr[k]+" ");
        }
    }
}
