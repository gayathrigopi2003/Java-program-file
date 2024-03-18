public class HPattern {
    public static void main(String[] args) {
        printHPattern(7); 
    }

    public static void printHPattern(int size) {
        if (size % 2 == 0) {
            size++; 
        }

        int mid = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || i == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
