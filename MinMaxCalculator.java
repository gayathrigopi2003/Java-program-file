public class MinMaxCalculator {
    public static void main(String[] args) {
    
        if (args.length == 0) {
            System.out.println("Please provide at least one number as a command-line argument.");
            return;
        }

       
        try {
            int min = Integer.parseInt(args[0]);
            int max = Integer.parseInt(args[0]);

            for (int i = 1; i < args.length; i++) {
                int currentNumber = Integer.parseInt(args[i]);

             
                if (currentNumber < min) {
                    min = currentNumber;
                }

                if (currentNumber > max) {
                    max = currentNumber;
                }
            }

       
            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid integers as command-line arguments.");
        }
    }
}
