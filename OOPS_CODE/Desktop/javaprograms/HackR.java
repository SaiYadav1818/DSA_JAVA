public class HackR {
    public static void main(String[] args) {
        
   int i=20,j=23,k=6;
        // Write your code here
        int count=0;
    for(int l=i;l<=j;l++)
    {
        int num1=l;
        int num=rev(l);
        int diff=num1-num;
        if(diff%k==0)
        {
            count++;
        }
        
    }
    System.out.println(count);
        }
    public static int rev(int l)
    {
        String str="";
        while(l>0)
        {
          int r=  l%10;
          str+=r;
          l=l/10;
        }
        int num=Integer.parseInt(str);
        return num;
    }
    
    }

