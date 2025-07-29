class productArr{
    public int[] productExceptSelf(int[] nums) {
        int[] a=new int[nums.length];

        int p=1;
        int z=1;
    int count=0;
        boolean f=false;
        int in=0;
     
        for(int i=0;i<nums.length;i++)
        {
        
p*=nums[i];
if(nums[i]==0)
{
    count++;
}
if(nums[i]!=0)
{
    f=true;
  
    z*=nums[i];
}
        }
        for(int j=1;j<=nums.length;j++)
        {
      
            if(nums[j-1]==0 && f && count==1)
            {
                a[in++]=z;
            }
            else if(nums[j-1]!=0){
           a[in++] =p/nums[j-1];}
           else if (!f || count>1)
           {
            a[in++]=0;
           }
          
        }
        return a;
    }
}