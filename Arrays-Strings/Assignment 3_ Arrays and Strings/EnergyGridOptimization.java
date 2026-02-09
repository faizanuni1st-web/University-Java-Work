public class EnergyGridOptimization {

    public static void main(String[] args) {

        int[][] grid = {
                {120, 200, 150},
                {180, 250, 300},
                {170, 160, 140}
        };

        int threshold = 200;
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] updatedGrid = new int[rows][cols];

        // Copy original values to updated grid first
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                updatedGrid[i][j] = grid[i][j];
            }
        }

        // Process cells above threshold
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] > threshold) {
                    int sum = 0, count = 0;

                    // Up
                    if (i - 1 >= 0) {
                        sum += grid[i - 1][j];
                        count++;
                    }
                    // Down
                    if (i + 1 < rows) {
                        sum += grid[i + 1][j];
                        count++;
                    }
                    // Left
                    if (j - 1 >= 0) {
                        sum += grid[i][j - 1];
                        count++;
                    }
                    // Right
                    if (j + 1 < cols) {
                        sum += grid[i][j + 1];
                        count++;
                    }

                    updatedGrid[i][j] = sum / count;   // Average of neighbors
                }
            }
        }
       

        // Original Grid
        System.out.println("Original Grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               System.out.print(grid[i][j] + " ");
            }
           System.out.println();
        }
        System.out.println();



        // Print optimized grid
        System.out.println("Optimized Grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(updatedGrid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
