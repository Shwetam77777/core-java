import java.util.*;
class Power{
public static void main (String[]ar){
int i, n=1,b,num;
Scanner sc =new Scanner(System.in);
System .out.println("Enter the power");
b=sc.nextInt();
num=sc.nextInt();
for(i=1;i<=num;i++)
{
n=b*n;
System.out.println("Power is:"+n);
}}}