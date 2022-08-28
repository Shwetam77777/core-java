import java.util.*;
class MyClass{
public static void main (String[]ar){
float p,r,t,si;
Scanner sc =new Scanner(System.in);
System .out.println("Enter the principal and rate and time");
p=sc.nextFloat();
r=sc.nextFloat();
t=sc.nextFloat();
si=(p*r*t)/100.0f;
System.out.println("simple interst is:"+si);
}}