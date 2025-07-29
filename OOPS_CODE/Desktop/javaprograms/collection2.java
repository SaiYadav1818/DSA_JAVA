import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
public class collection2 {
        public static void main(String[] args) {
           Collection c=new ArrayList();
List l=new ArrayList<>();
ArrayList ar=new ArrayList<>();
ar.add(12);
ar.add("hello");
System.out.println(ar);
ArrayList<Integer> arr=new ArrayList<Integer>();
arr.add(18);
arr.add(12);
arr.add(12);
arr.add(100);/* 
System.out.println(arr);
Collections.reverse(arr);
System.out.println(arr);
Collections.sort(arr);
for(Object i:arr)//integer also
{
    System.out.println(i);
}
System.out.println(ar.indexOf(12));

System.out.println(ar.equals(arr));

System.out.println(ar.isEmpty());

System.out.println(ar.size());

System.out.println(ar.lastIndexOf(arr));

System.out.println(Collections.min(arr));

System.out.println(Collections.max(arr));*/
System.out.println(Collections.frequency(arr,30));
/* 
for(int i=0;i<ar.size();i++ )
{
    System.out.print(ar.get(i));
}
Iterator i=arr.iterator();
while(i.hasNext())
{
    System.out.println(i.next());
}
i=arr.iterator();
while(i.hasNext())
{
    System.out.print(i.next());
}

        }
}
*/
