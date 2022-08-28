import java.util.*;
class Substring{
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
String temp;
temp= str.substring(startIndex, endIndex);
System.out.println("Substring is: "+temp);
}
}