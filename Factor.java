import java.util.*;
class Factor{
public static void PrintFactor(int n){
int i;
for(i=1;i<=n;i++){
if(n%i==0)
System.out.println("num is"+i);
}}
public static void main (String[]ar){
int j,n,num;
Scanner sc =new Scanner(System.in);
System .out.println("Enter the Factor");
n=sc.nextInt();
PrintFactor(n);
System.out.println("Factor is:"+n);
}}