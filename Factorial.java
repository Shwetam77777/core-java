import java.util.*;
class Factorial{
public static void main (String[]ar){
int i,n,num=1;
Scanner sc =new Scanner(System.in);
System .out.println("Enter the Factorial");
n=sc.nextInt();
for(i=1;i<=n;i++){
num = num*i;}
System.out.println("Factorial is"+ num);
}}