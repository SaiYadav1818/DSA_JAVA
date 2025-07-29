/*Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.*/
public class ArrLinkedList {
    public static void main(String[] args) {
        int[] a={9,9,9,9,9,9,9};
        int[] b={9,9,9,9};
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
   for(int i=a.length-1;i>=0;i--)
        {
            sb.append(a[i]);
        }
        int cs=Integer.parseInt(sb.toString());
        for(int i=b.length-1;i>=0;i--)
        {
            sb1.append(b[i]);
        }
        int cs1=Integer.parseInt(sb1.toString());
        int sum=cs+cs1;
        String str=Integer.toString(sum);
        int len=str.length();
char[] c=str.toCharArray();
for(int i=len-1;i>=0;i--)
{
    System.out.print(c[i]);
}

    }
}
