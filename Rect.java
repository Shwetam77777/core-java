import java.util.*;
class Rect{
public static void main (String[]ar){
int l ,b,a,p ;
Scanner sc=new Scanner(System.in);
System .out.println("Enter lenth and breath of Rectangle");
l=sc.nextInt();
b=sc.nextInt();
a=l*b;
System.out.println("Area is:"+a);
p=2*(l+b);
System.out.println("Perimeter is:"+p);
}}