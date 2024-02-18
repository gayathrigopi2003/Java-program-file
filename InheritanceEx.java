class AC{
static int n1=2,n2=6;
}

class B extends AC{
protected static int n3= 5, n4=4;
}

public class InheritanceEx{
public static void main(String[]args){
// System.out.println(n4);
B b = new B();
System.out.println(b.n4);
}
}