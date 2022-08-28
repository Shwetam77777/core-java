import java.util.Scanner;
class LowerToUpper{
public static String upper(String str){
char ch[]=str.toCharArray();
int a=0,A=0;
String n_str="";
for(int i=0;i<ch.length;i++){
if(ch[i]>'a'&& ch[i]<='z'){
a=ch[i]-32;
char c=(char)a;
n_str=n_str+c;
}
else if(ch[i]>'A'&& ch[i]<='Z'){
A=ch[i]+32;
char c=(char)A;
n_str=n_str+c;}
else
n_str=n_str+ch[i];
}
return n_str;
}
public static void main (String[] args){
int i,len;
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String str=sc.nextLine();
System.out.print(upper(str));
}
}
