import java.util.Scanner;
class Name{
public static String upper(String str){
char ch[]=str.toCharArray();
int a=0,A=0;
String n_str="";
int b=ch.length-1;
for(int i=0;i<ch.length;i++){
if(ch[i]=='a'){
System.out.println("name starts with a");
}
else if(b=='a'){
System.out.println("name end with a");
}
else if(ch[i]=='a'||b=='a'){
System.out.println("name start and end with a");
}}
else
System.out.println("anywhere a");
}
public static void main (String[] args){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String str=sc.nextLine();
System.out.println(upper(str));
}
}
