public class PerfectNumberTask {
    public static boolean isPerfect(int num) {
        return 1+2+3 == num;
    }

    public static void main(String[] args) {
        int number = 6; 
        if (isPerfect(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
		
    }
}
