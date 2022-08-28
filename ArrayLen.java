import java.util.*;
class ArrayLen{
public static void main (String[]ar){
int i,n,c=0;
Scanner sc =new Scanner(System.in);
System .out.println("Enter the numbers");
n=sc.nextInt();
int a[]=new int[n];
for(int a1:a)
for(i=1;i<a.length;i++){
if(a1%i==0){
c++;}
if(c==2)
System.out.println("a1");
}}}