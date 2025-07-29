import java.util.Scanner;

public class TowerOfHanoi {
    static int moveCount;

    public static void solveHanoi(int n, char from, char to, char aux) {
        if (n == 0) return;

        // Move n-1 disks from 'from' to 'aux' using 'to' as auxiliary
        solveHanoi(n - 1, from, aux, to);
        
        // Move nth disk from 'from' to 'to'
        System.out.println("Move " + n + " from " + from + " to " + to);
        moveCount++;

        // Move n-1 disks from 'aux' to 'to' using 'from' as auxiliary
        solveHanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt(); // Number of disks
            moveCount = 0;
            
            solveHanoi(N, 'A', 'B', 'C'); // Moving from A → B → C

            System.out.println(moveCount * 2); // Print minimum moves
        }
        
        sc.close();
    }
}
