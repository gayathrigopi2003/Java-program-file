public class Commandline{
	
	public static void main(String[]args){
		

        if (args.length > 0) {
            int intValue = Integer.parseInt(args[0]);
            System.out.println("Integer value entered: " + intValue);
        } else {
            System.out.println("No integer value provided as an argument.");
        }
    }
}
	