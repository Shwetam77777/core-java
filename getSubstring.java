import java.util.*;
class getSubstring{
public static String Sub(String str){
char ch[]=str.toCharArray();
int a=0;
int b=a-1;
String n_str="";
for(int i=b;i<ch.length;i++){
if(i<a-1+ch.length)
return str;
}
else
System.out.print("substring is not present");
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str="";
int startIndex,endIndex;
System.out.print("Enter the string: ");
str=sc.next();
System.out.print("Enter start index: ");
startIndex=sc.nextInt();
System.out.print("Enter end index: ");
endIndex=sc.nextInt();
System.out.print("substring is:"+Sub(str));
}
}