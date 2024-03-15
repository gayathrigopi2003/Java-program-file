class FibonoTask{

public static void main(String []args){
int n=3;
int sum=0;
int a=0;
int b=1;
for(int i=0;i<=n;i++){
sum = a+b;
a=b;
b=sum;
System.out.println(sum);
}

}
}