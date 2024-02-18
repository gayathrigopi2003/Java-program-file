public class Eligible
{
	public static void main(String[] args) {
	   
        if (args.length == 2) {
		
                 
                String name = args[0];
                int age = Integer.parseInt(args[1]);

                if (age >= 18) {
                    System.out.println(name + " is eligible to vote.");
                } else {
                    System.out.println(name + " is not eligible to vote. Minimum age required: 18");
                }
				
        } 
	    }
        }