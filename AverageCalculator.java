public class AverageCalculator {
    public static void main(String[] args) {
       
        if (args.length != 3) {
            System.out.println("Please provide three numbers as command-line arguments.");
            return;
        }

        
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        double number3 = Double.parseDouble(args[2]);

        double average = (number1 + number2 + number3) / 3;

     
        System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is: " + average);
    }
}
