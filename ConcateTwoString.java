public  class ConcateTwoString{
public static void main(String[] args)
{
if(args.length == 2 ) {
String result = args[0] + args[1];
System.out.println("Concatenated Result : " + result);
}
else {
System.out.println("Enter two stringss : " );
}
}
}