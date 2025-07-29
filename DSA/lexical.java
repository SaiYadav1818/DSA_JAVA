
import java.util.Arrays;

public class lexical {

    public static void main(String af[]){
        String[] arr=new String[8];
        arr[0]="algo"  ;
        arr[1]= "alog";
        arr[2]=" aglo" ;
        arr[3]="agol";
        arr[4]= "aolg";
        arr[5]= "aogl";
        arr[6]="lgao";
arr[7]="galo";
          /*lago,  laog,
            lgoa,  loag,  loga,  galo,  gaol,  glao,  gloa,  goal,  gola,  oalg,  oagl,  olag,  olga,  ogal,  ogla"*/
           Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
           System.out.println(Arrays.toString(arr)); 
    }
}