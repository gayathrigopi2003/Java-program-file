public class GetNoCommandline{

public static void main (String[]args){
if(args.length<18){
int IsVote = Integer.parseInt(args[0]);
System.out.println("Gayu is Eligible to vote" + IsVote);
}
else {

System.out.println("Gayu is not Eligible to vote");

}
} 
}
  