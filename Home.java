import java.util.*;
class Home{
public static boolean Provic(int num){
int n=1;
int i;
for(i=1;i<=num;i++){
if(num%i==0)
n++;
if(n*n==num){
return true;
}}
return false;
}
public static void main (String[]ar){
Scanner sc =new Scanner(System.in);
System .out.println("Enter the number");
int num=sc.nextInt();
if(Provic(num)==true)
System.out.println("yes its provic ");
else
System.out.println("no its not provic");
}}