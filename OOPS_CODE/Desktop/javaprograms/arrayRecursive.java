class A {
    int[][] arr(int[][] b, int[][] c, int[][] res, int x, int y) {
        // Base case: If row index x reaches the end of the array, return the result array
        if (x == b.length) {
            return res;
        }

        // Add corresponding elements
        res[x][y] = b[x][y] + c[x][y];

        // Move to the next column, or reset column and move to the next row
        if (y == b[0].length - 1) {
            // Move to the next row and reset the column index
            return arr(b, c, res, x + 1, 0);
        } else {
            // Move to the next column
            return arr(b, c, res, x, y + 1);
        }
    }
}

class ArrayRecursive {
    public static void main(String[] args) {
        A obj = new A();
        int[][] b = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] c = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] res = new int[b.length][b[0].length];
        res = obj.arr(b, c, res, 0, 0);

        // Print the resulting array
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
