import java.util.Arrays;
public class AnagramOne{
public static void main(String [] args){
String str1 = "race";
String str2 = "care";


char[] c = str1.toCharArray();
char[] d= str2.toCharArray();

Arrays.sort(c);
Arrays.sort(d);
if(Arrays.equals(c,d)){
System.out.println("This is a anagram");
}
else{
System.out.println("not a anagram");
}

}
}