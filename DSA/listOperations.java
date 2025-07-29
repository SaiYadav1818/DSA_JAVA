import java.io.*;
import java.util.*;

public class listOperations{

static void print(List<Integer> list )
{
    for(int i=0;i<list.size();i++)
    {
        System.out.print(list.get(i)+" ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        String str=sc.next();
        if(str.equals("append"))
        {
            int app=sc.nextInt();
            list.add(app);
            print(list);
        }
        else if(str.equals("insert"))
        {
            int in1=sc.nextInt();
            int in2 =sc.nextInt();
            if(in1>=0 && in1<list.size()){
            list.add(in1,in2);}
           print(list);
        }
        else if(str.equals("extend"))
        {
          List<Integer> copy=new ArrayList<>(list);
          list.addAll(copy);
            print(list);
        }
        else if(str.equals("reverse"))
        {
            Collections.reverse(list);
         print(list);
        }
        else if(str.equals("length"))
        {
            System.out.println(list.size());
        }
        else if(str.equals("sort"))
        {
            Collections.sort(list);
           print(list);
        }
        else if(str.equals("count"))
        {int count=sc.nextInt();
           int c= Collections.frequency(list,count);
           System.out.println(c);
        }
        else if(str.equals("index"))
        {
            int index=sc.nextInt();
            System.out.println(list.indexOf(index));
        }
    }
    }
}