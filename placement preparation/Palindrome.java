import java.util.Scanner;
class Palindrome
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the No:");
int num=sc.nextInt();
int rev=0;
int temp=num;
while(num!=0)
{
rev=rev * 10 + num % 10;
num=num/10;
}
if(temp==rev)
{
System.out.println("It is a Palindrome number");
}
else {
System.out.println("It is not a Palindrome number");
}
}
}