public class EvenNumberCheck {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please provide a single number as a command-line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

          
            if (isEven(number)) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is not an even number.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer as a command-line argument.");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}