import java.util.ArrayList;
import java.util.Collection;

class abc{
    int c,d;
  abc(int a,int b){
this.c=a;
this.d=b;
    }
}
public class collections1 {
    public static void main(String[] args) {
        abc p1=new abc(1,2);
    abc p2=new abc(3,4);
    Collection<abc> obj=new ArrayList<>();
    obj.add(p1);
    obj.add(p2);
for(abc ele:obj)
System.out.println(ele);
    }
}
