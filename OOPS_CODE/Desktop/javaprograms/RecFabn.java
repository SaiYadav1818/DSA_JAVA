/*class RecFabn{
    static  int fab(int n)
    {
        if(n==0){
            return n;
        }
        else if(n==1)
        {
            return n;
        }
        else{
            return fab(n-1)+fab(n-2);
        }
    }


    public static void main(String[] args) {
        

     for(int i=0;i<10;i++)
     {
        System.out.println(fab(i));
     }
    }}*/
    class a{
        int fab(int n)
        {
            if(n==0){
                return 0;
            }
            else if(n==1)
            {
                return 1;
            }
            else{
                return fab(n-1)+fab(n-2);
            }
        }
    }class RecFabn{
    
        public static void main(String[] args) {
            
    a obj=new a();
         for(int i=0;i<10;i++)
         {
            System.out.println(obj.fab(i));
         }
        }}
