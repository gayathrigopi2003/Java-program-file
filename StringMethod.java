public class StringMethod{

public static void main(String[]args){

String s1 = " Be,Confident";
String s11 = "confident";
String s2 = "Beautiful";
String s3 = "  ComfortSoon";

// 1) Length()
System.out.println(s1.length()); 

// 2) CharAt(int index value)
System.out.println(s2.charAt(6));

// 3) Substring(begin Index  value)
System.out.println(s3.substring(7));

// 4) substring(begin to End index values)
System.out.println(s1.substring(0,9));

// 5) concat(string str)
System.out.println(s2.concat(s3));

// 6) equals(object obj)
System.out.println(s1.equals(s2));

// 7) equalsIgnorecase(string anotherstring)
System.out.println(s1.equalsIgnoreCase(s11));  

// 8) startwith(string prefix :front words)
System.out.println(s1.startsWith("Be"));

// 9) Endwith (String suffix ): last word 
System.out.println(s1.endsWith("Confident"));

// 10) contain(charsequence sequence)
System.out.println(s1.contains("Be"));

// 11) replace (replacement)
System.out.println(s3.replace("ComfortSoon", "ComfortSooning"));

// 12) trim()
System.out.println(s3.trim());

String str = "gayu, vino, ranju, sandhiya";
// 13) split(String regex)
System.out.println(str.split(","));

// 14) toUpperCase()
System.out.println(s1.toUpperCase());

String s= "gayu";
// 15) toLowerCase()
System.out.println(s.toLowerCase());
String g = "";
// 16) isEmpty
System.out.println(g.isEmpty());

} 
}