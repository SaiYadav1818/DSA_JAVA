import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int g = 1; g <= t; g++) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            
            Collections.sort(list); // Sort input numbers first
            
            ArrayList<Integer> process = new ArrayList<>();
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            
            subset(process, list, 0, res);

            // Sort subsets lexicographically
            Collections.sort(res, (a, b) -> {
                int minSize = Math.min(a.size(), b.size());
                for (int i = 0; i < minSize; i++) {
                    if (!a.get(i).equals(b.get(i))) {
                        return a.get(i) - b.get(i); // Compare elements lexicographically
                    }
                }
                return a.size() - b.size(); // Shorter subset comes first if prefix match
            });

            // Print sorted subsets
            for (ArrayList<Integer> subset : res) {
                for (int num : subset) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            if (g < t) {
                System.out.println(); // Separate test cases
            }
        }
    }

    public static void subset(ArrayList<Integer> p, ArrayList<Integer> list, int index, ArrayList<ArrayList<Integer>> res) {
        if (index == list.size()) {
            if (!p.isEmpty()) {
                res.add(new ArrayList<>(p)); // Store a copy of p
            }
            return;
        }

        // Include current element
        p.add(list.get(index));
        subset(p, list, index + 1, res);

        // Exclude current element
        p.remove(p.size() - 1);
        subset(p, list, index + 1, res);
    }
}
