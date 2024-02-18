public class AverageNumber{
public static void main(String[]args){

int argsLength = args.length;
int total = 0;

for(int i=0; i<argsLength; i++){
total+=Integer.parseInt(args[i]);
}
float a = total/argsLength;

System.out.println("AverageNumber:" +total/argsLength);
System.out.println("AverageNumber in float:" +a);
}
}
