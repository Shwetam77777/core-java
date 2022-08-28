import java.util.*;
class Prime{
public static boolean Prime(int num){
int i,c=0;
for(i=1;i<=num;i++){
if(num%i==0){
c++;}}
if(c==2){
return true;}
else
return false;
}
public static void main (String[]ar){
Scanner sc =new Scanner(System.in);
System .out.println("Enter the number");
int num=sc.nextInt();
if(Prime(num)==true)
System.out.println("yes its prime ");
else
System.out.println("no its not prime");
}}