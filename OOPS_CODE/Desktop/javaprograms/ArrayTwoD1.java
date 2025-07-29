import java.util.Arrays;

public class ArrayTwoD1 {
    public static void main(String[] args) {
        
        int[][] res={{1,2,3,4},{5,6,7},{8,7,6}};
        for(int i=0;i<res.length;i++)
        {
              
/*for(int j=0;j<res[i].length;j++)
{

   
//System.out.print(res[i][j]+" ");

}*/
System.out.print(Arrays.toString(res[i])); 
System.out.println();
        }
        System.out.println(Arrays.deepToString(res));
       System.out.println(Arrays.toString(res[0]));
       
    }
    
}
