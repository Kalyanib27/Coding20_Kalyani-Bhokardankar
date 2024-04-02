import java.util.Arrays;
class ReverseArray
{
static void reverse(int a[])
{
int i=0,j=a.length-1,temp;
while(i<j){
temp=a[i];
a[i]=a[j];
a[j]=temp;
i++;
j--;
}}
public static void main(String args[])
{
int a[]={10,20,30,40,50};
System.out.println("Original Array " + Arrays.toString(a));
reverse(a);
System.out.println("Reverse Array " + Arrays.toString(a));
}
}