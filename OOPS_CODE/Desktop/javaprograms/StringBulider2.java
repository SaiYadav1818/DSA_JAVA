import java.util.Scanner;

public class StringBulider2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1=sc.next();
        StringBuffer sb=new StringBuffer(); 
        StringBuffer sb1=new StringBuffer(); 
         StringBuffer sb2=new StringBuffer(); 
           StringBuffer sb3=new StringBuffer(); 
        for(int i=0;i<2;i++)
        {
           sb.append(s1.charAt(i));
        }
         for(int i=2;i<s1.length();i++)
        {
           sb2.append(s1.charAt(i));
        }
     String s2=sb.toString();
     int a=Integer.parseInt(s2);
     System.out.println(a);
      for(int i=s1.length()-2;i<s1.length();i++)
        {
            sb1.append(s1.charAt(i));
        }
        String s6=sb1.toString();
        System.out.println(s6);
        if(s6.equals("PM"))
       {
        if(a==12)
        {sb3.append("12");

        }else{
          sb3.append(String.format("%02d",12+a));}
       }
       else if(s6.equals("AM"))
  {
      if(a==12)
      {
         
sb3.append("00");
      }
    else{
        sb3.append(String.format("%02d",a));
    }
    }
       sb3.append(sb2);
     String s5=sb3.toString();
     System.out.println(s5);
        /* 
        int n=sc.nextInt();
        byte[] barr=s1.getBytes();
        String s2=new String(barr,n,1);
        if(n>0)
        {
            System.out.println(barr[n]);
            System.out.println(s2);
        }*/
    }
}
