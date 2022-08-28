import java.util.*;
class Array{
public static void main (String[]ar){
int i,n;
Scanner sc =new Scanner(System.in);
System .out.println("Enter the numbers");
n=sc.nextInt();
int a[]=new int[n];
int sum=0,avg=1;
System.out.println("enter array elements");
for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
sum=sum+a[i];
avg=sum/n;
}
System.out.println("total is="+sum);
System.out.println("average is="+avg);
}}
