class spiralt {
    
    public static void main(String[] args) {
        int[][] result = new int[5][5];
        
        int top = 0, bottom = 4, left = 0, right = 4;
        int count = 1; // Start count from 1
       while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result[top][i] = count++;
            }
            top++;
            
            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                result[i][right] = count++;
            }
            right--;
            
            // Traverse from right to left
            if (top <= bottom) { // Check if the row still exists
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = count++;
                }
                bottom--;
            }
            
            // Traverse from bottom to top
           if (left <= right) { // Check if the column still exists
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = count++;
                }
                left++;
            }
    }
        // Print the result matrix
     for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                 String formattedNumber = String.format("%02d", result[i][j]);
        System.out.print(formattedNumber + " ");
                /*if(result[i][j]<=5){
    
                System.out.print(" "+result[i][j] +" ");
                }
                else
                {
                     System.out.print(result[i][j] +" ");
                }*/
                
            }
            System.out.println();
        }
    }
}
