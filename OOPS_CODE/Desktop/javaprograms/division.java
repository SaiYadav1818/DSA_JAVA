public class division {

    public static void main(String[] args) {
       /*  int counter=10;
        do{
System.out.print(2/counter);
counter--;
        }
       while(counter>2);*//* 
int[] a =new int[5];
a=new int[]{1,2,3,4,5};
System.out.println(a[0]);
Float f[]={1.3f,1.2f};*/
int x=4,y=5;
int sum=0;
for(int i=0;i<x;i++)
{
    for(int j=i;j<y;j++)
    {
        sum+=j;
    }
}
System.out.println(sum);
    }
}