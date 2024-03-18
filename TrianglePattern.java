public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 5; 
        printFullPyramid(rows);
    }

    public static void printFullPyramid(int rows) {
        for (int i = 0; i < rows; i++) {
           
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

        
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
