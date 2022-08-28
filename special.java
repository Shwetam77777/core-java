import java.util.*;
class Special{
public static boolean special(int n){
int i,d,sum=0,fact=1;
i=n;
while(i!=0){
d=i%10;
i=i/10;
for(int a=1;a<=d;a++)
{
fact=a*fact;
}
sum=sum+fact;
fact=0;
}
if(sum==n)
return true;
else
return false;
}
public static void main(String args[]){
int n,i,d,sum=0,fact=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an number");
n=sc.nextInt();
if(special(n))
System.out.println("Special Number");
else
System.out.println("Not a Special Number");
}}