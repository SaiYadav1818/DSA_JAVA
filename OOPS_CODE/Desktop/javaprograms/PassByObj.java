//Prefixed Fixed code
import java.util.Scanner;
class Question { 
      //Define a class Question with two elements e1 and e2.
  Scanner sc = new Scanner(System.in);
int e1 = sc.nextInt();  //Read e1
int e2 = sc.nextInt();  //Read e2
}
public class PassByObj{
 public   static void swap(Question x)
    {
      int temp=x.e2;
      x.e2=x.e1;
      x.e1=temp;
    }
    public static void main(String[] args) {
        Question t = new Question();
        System.out.println("Before Swap: " + t.e1 + " " + t.e2);
        swap(t);
        System.out.print("After Swap: " + t.e1 + " " + t.e2);
      }
    }
    /*
import java.util.Scanner;
class Question { 
   int e1,e2;

    public  Question(){
        Scanner sc = new Scanner(System.in);
 e1 = sc.nextInt();  
e2 = sc.nextInt();  
}}
public class PassByObj{
 public   static void swap(Question x)
    {
      int temp=x.e2;
      x.e2=x.e1;
      x.e1=temp;
    }
    public static void main(String[] args) {
        Question t = new Question();
        System.out.println("Before Swap: " + t.e1 + " " + t.e2);
        swap(t);
        System.out.print("After Swap: " + t.e1 + " " + t.e2);
      }
    } */