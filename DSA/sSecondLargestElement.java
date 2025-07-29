public class sSecondLargestElement {
    public static void main(String[] args) {
        int[] arr={2,4,1,5,6,36,54,23};
 int firstnum=Integer.MIN_VALUE;
 int secondnum=Integer.MIN_VALUE;
 for(int num:arr)
 {
    if(num>firstnum)
    {
        secondnum=firstnum;
        firstnum=num;
       
    }
    else if(num>secondnum && num!=firstnum)
    {
secondnum=num;
    }
    }
    System.out.println(secondnum);
 }
    }


