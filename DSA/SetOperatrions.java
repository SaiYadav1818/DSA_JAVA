import java.io.*;
import java.util.*;

public class SetOperatrions{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
  Scanner sc=new Scanner(System.in);
  Set<Integer> set1=new TreeSet<>();
  Set<Integer> set2=new TreeSet<>();
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
  {
    set1.add(sc.nextInt());
  }
  int n1=sc.nextInt();

for(int i=0;i<n1;i++)
{
    set2.add(sc.nextInt());
}
  
Set<Integer> union=new TreeSet<>(set1);
union.addAll(set2);
for(Integer num:union)
{
    System.out.print(num+" ");
}
System.out.println();
Set<Integer> intersection=new TreeSet<>(set1);
intersection.retainAll(set2);
for(Integer num:intersection)
{
    System.out.print(num+" ");
}
System.out.println();
Set<Integer> symmdiff=new TreeSet<>(union);
symmdiff.removeAll(intersection);
for(Integer num:symmdiff)
{
    System.out.print(num+" ");
}
System.out.println();
System.out.println(intersection.isEmpty());
System.out.println(set2.containsAll(set1));
System.out.println(set1.containsAll(set2));

    }
}
/*Given two arrays of size N and M, insert them into two sets A and B.
Implement the following operations in the same sequential order:Union of A and B: 
Find the union of A and B, print the elements of the resulting set in sorted order.
Intersection of A and B: Find the intersection of A and B, print the elements of the resulting set in sorted order.
Symmetric Difference of A and B: Find the symmetric difference of A and B, print the elements of the resulting set in sorted order.
Check if A and B are disjoint sets: If yes, print true, otherwise, print false.
Check if A is a subset of B: If yes, print true, otherwise, print false.
Check if A is a superset of B: If yes, print true, otherwise, print false. */