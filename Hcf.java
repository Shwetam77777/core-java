import java.util.*;
class Hcf{
public static int Gcd(int u,int v){
int r;
while(u!=0){
r=v%u;
v=u;
u=r;}
return(v);
}
public static void main (String[]ar){
int u,v;
Scanner sc =new Scanner(System.in);
System .out.println("Enter two number");
u=sc.nextInt();
v=sc.nextInt();
int n=Gcd(u,v);
System.out.println("hcf is:"+n);
}}