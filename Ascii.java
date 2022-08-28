import java.util.*;
class Ascii{
public static int ascii(char ch){
int a=ch;
return(a);
}
public static void main (String[]ar){
int a;
Scanner sc =new Scanner(System.in);
System .out.println("Enter the char");
char ch=sc.next().charAt(0);
System.out.println("ascii is:"+ascii(ch));
}}

