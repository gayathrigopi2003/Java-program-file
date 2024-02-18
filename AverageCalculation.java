public class AverageCalculation {
   
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0; 
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
      
        if (args.length == 0) {
            System.out.println("Please provide at least one number as a command-line argument.");
            return;
        }

        try {
            int[] numbers = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            double average = calculateAverage(numbers);
            System.out.println("Average: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid integers as command-line arguments.");
        }
    }
}
