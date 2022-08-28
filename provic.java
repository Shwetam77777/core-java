import java.util.*;
class Provic{
public static boolean Provic(int num,int n){
int i;
for(i=1;i<=num;i++){
if((n*(n+1))==num){
return true;
}}
return false;
}
public static void main (String[]ar){
Scanner sc =new Scanner(System.in);
System .out.println("Enter the number");
int num=sc.nextInt();
int n=sc.nextInt();
if(Provic(num,n)==true)
System.out.println("yes its provic ");
else
System.out.println("no its not provic");
}}