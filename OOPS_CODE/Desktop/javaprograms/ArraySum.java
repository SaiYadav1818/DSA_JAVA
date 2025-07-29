class ArraySum {
    public static void main(String[] args) {
    int a[] ={1,4,3,5,6};
   int  target=9;
   boolean pair=true;
for(int i=0;i<a.length;i++)
{
    for(int j=i+1;j<a.length;j++)
    {
      int sum=a[i]+a[j];
if(sum==target)
{
    System.out.println(sum);
    System.out.println(a[i]+" "+a[j]);
    pair=false;
    break;
}
if(!pair)
{
    break;
}
    }
}
    }
    }