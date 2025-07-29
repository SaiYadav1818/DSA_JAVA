/*
Student  received a 73 , and the next multiple of  from  is . Since , the student's grade is rounded to .75-73=2
Student  received a  67, and the next multiple of  from  is . Since , the grade will not be modified and the student's
 final grade is .70-3=67 return 67
Student  received a 38, and the next multiple of  from  is . Since , the student's grade will be rounded to .
Student  received a 33 grade below , so the grade will not be modified and the student's final grade is .
*/import java.util.ArrayList;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    int n,count=0;
    ArrayList<Integer> arr = new ArrayList<>();
for(int i=0;i<grades.size();i++)
{
   int m=grades.get(i);
   n=m;
   if(m>=38){
   while(n%5!=0)
   {
    n++;
     
   }
   
   if(n-m<3)
   {
       arr.add(n);
   }
   else
   {
       arr.add(m);
   }
    }
    else{
        arr.add(m);
    }
}
return arr;
    }

}

public class GradingStd {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

