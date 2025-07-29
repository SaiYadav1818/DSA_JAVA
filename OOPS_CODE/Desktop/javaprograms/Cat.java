import java.io.*;
import java.util.*;

public class Cat {

    // Function to determine which cat gets to the mouse first
    static String catAndMouse(int x, int y, int z) {
        // Calculate the distances from each cat to the mouse
        int distA = Math.abs(x - z);
        int distB = Math.abs(y - z);

        // Determine which cat gets to the mouse first or if it's a tie
        if (distA < distB) {
            return "Cat A"; // Cat A is closer
        } else if (distB < distA) {
            return "Cat B"; // Cat B is closer
        } else {
            return "Mouse C"; // Both cats are equidistant
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Read number of test cases
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]); // Position of Cat A
            int y = Integer.parseInt(xyz[1]); // Position of Cat B
            int z = Integer.parseInt(xyz[2]); // Position of Mouse C

            String result = catAndMouse(x, y, z); // Determine the result

            // Print the result to the console
            System.out.println(result);
        }

        scanner.close(); // Close the Scanner
    }
}
/*The distance between any two positions 
𝐴
A and 
𝐵
B can be calculated as:
Distance
=
∣
𝐴
−
𝐵
∣
Distance=∣A−B∣
This means:
Distance from Cat A to Mouse C:
Distance A to C
=
∣
𝑥
−
𝑧
∣
Distance A to C=∣x−z∣
Distance from Cat B to Mouse C:
Distance B to C
=
∣
𝑦
−
𝑧
∣
Distance B to C=∣y−z∣
Evaluate the Distances:

If you want to determine which cat gets to the mouse first:
Compare the two distances:
If 
∣
𝑥
−
𝑧
∣
<
∣
𝑦
−
𝑧
∣
∣x−z∣<∣y−z∣: Cat A is closer.
If 
∣
𝑦
−
𝑧
∣
<
∣
𝑥
−
𝑧
∣
∣y−z∣<∣x−z∣: Cat B is closer.
If 
∣
𝑥
−
𝑧
∣
=
∣
𝑦
−
𝑧
∣
∣x−z∣=∣y−z∣: Both cats reach the mouse at the same time.
Example Calculation
Let’s say:
Cat A is at position 
𝑥
=
2
x=2
Cat B is at position 
𝑦
=
5
y=5
Mouse C is at position 
𝑧
=
3
z=3
Calculate Distances:

Distance from Cat A to Mouse C:
∣
2
−
3
∣
=
1
∣2−3∣=1
Distance from Cat B to Mouse C:
∣
5
−
3
∣
=
2
∣5−3∣=2
Compare Distances:

Since 
1
<
2
1<2, Cat A is closer to Mouse C. */
