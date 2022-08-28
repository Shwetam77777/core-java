import java.util.*;
class TitleStr{
public static String Sub(String str){
char a=s.toCharAt(i);
for(int i =0;i<s.length();i++)
{
if(a==' ')
{
str=str+(Character.toUpperCase(a));
i++; 
}
 else
{
str =str+(Character.toLowerCase(a));
}
}}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
String s=sc.nextLine();
String str ="";        
System.out.println(Sub(str));
}
}