import java.util.*;
public class Palindrome {
public static void main(String[] args) {
int num , rev = 0, rem, n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an number");
num=sc.nextInt();
n= num;
while( num != 0 )
{
 rem = num % 10;
 rev = rev * 10 + rem;
 num  /= 10;
 }
 if (n == rev)
 System.out.println(n + " is a palindrome.");
else
 System.out.println(n + " is not a palindrome.");
}
}