class Fibonacci{
static void fibo(int n){
int a=0,b=1,t;
System.out.println(a+"\n"+b+"");
for(int i=1;i<=n-2;i++)
{
t=a+b;
a=b;
b=t;
System.out.println(t+"");
}
}
public static void main(String args[])
{
Fibonacci.fibo(10);
}
}