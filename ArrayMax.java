import java.util.*;
class ArrayMax{
public static void main (String[]ar){
int i,n,num=0,num1=0;
Scanner sc =new Scanner(System.in);
System .out.println("Enter the numbers");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter array elements");
for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
int max=a[0];
int min=a[0];
for(i=0;i<a.length;i++){
if(max<a[i]){
max=a[i];
num=i;
}
if(min>a[i]){
min=a[i];
num1=i;
}
}
System.out.println("largert numbers is="+max);
System.out.println("Smallest numbers is="+min);

System.out.println("largert numbers position is="+num);
System.out.println("Smallest numbers position is="+num1);
}}
