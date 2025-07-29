import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ListSumofDiagnol {
    public static void main(String[] args) {
         List<List<Integer>> arr = new ArrayList<>();
                arr.add(Arrays.asList(1, 2, 3));  // Row 1
        arr.add(Arrays.asList(4, 5, 6));  // Row 2
        arr.add(Arrays.asList(7, 8, 9)); 
        int sum1=0,sum2=0,diff;
    for(int i=0;i<arr.size();i++)
    {
        for(int j=0;j<arr.size();j++)
        {
        if(i==j)
        {
           sum1 +=arr.get(i).get(j);  //sum of primary diagnol
        }
        if(i+j==arr.size()-1)
        {
           sum2+=arr.get(i).get(j); //sum of secondary daignol
        }
        }
    }
    if(sum1>sum2){
    diff=sum1-sum2;}
    else
    {
        diff=sum2-sum1;
    }
   System.out.println(diff);

    }
}
