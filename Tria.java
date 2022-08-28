import java.util.*;
class Tria{
public static void main (String[]ar){
float l ,b ,h,a,p ;
Scanner sc=new Scanner(System.in);
System .out.println("Enter lenth and breath and height of triangle");
l=sc.nextFloat();
b=sc.nextFloat();
h=sc.nextFloat();
a=(float)(l*b)*1/2;
System.out.println("Area is:"+a);
p=l+b+h;
System.out.println("Perimeter is:"+p);
}}