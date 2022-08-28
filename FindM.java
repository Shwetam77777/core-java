import java.util.*;
public class FindM{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String inputString;
String subString;
System.out.println("Enter a string : ");
inputString = scanner.nextLine();
System.out.println("Enter a substring to find in the string : ");
subString = scanner.next();
int index = inputString.indexOf(subString);
if (index != -1) {
System.out.println("Index of this word : " + index);
} else {
System.out.println("The input sub-string is not found in the string.");
}
}
}