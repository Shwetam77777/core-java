import java.util.Scanner;
class Xyz{
public static String upper(String str){
char ch[]=str.toCharArray();
int a=0,A=0;
String n_str="";
for(int i=0;i<ch.length;i++){
if(ch[i]>'a'&& ch[i]<='z'||ch[i]>'A'&& ch[i]<='Z')
return str;
}
else
System.out.println("string not found");
}
public static void main (String[] args){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String str=sc.nextLine();
System.out.print(upper(str));
}
}
