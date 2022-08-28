import java.util.*;
class FindSub{
public static boolean Sub(String str,String str1){
 boolean match = true;
char ch[]=str.toCharArray();
char d[]=str1.toCharArray();
for(int i=0;i<ch.length;i++){
for(int j=0;i<d.length;j++){
if(ch[i]==d[j]){
 match =true;}
 else
match = false;
}}
return match;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.next();
System.out.println("Enter the string to find");
String str1=sc.next();
if(Sub(str,str1)){
System.out.println("yes");}
else{
System.out.println("No");
}}}