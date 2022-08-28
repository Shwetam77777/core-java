import java.util.*;
class TitleCase{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    System.out.println("ent");

    String s=in.nextLine();
    String str ="";        
    char a ;

    for(int i =0;i<s.length();i++)
    {
        a = s.charAt(i);
        if(a==' ')
        {
            str = str+Character.toLowerCase(a)+(Character.toUpperCase(s.charAt(i+1)));
            i++; 
        }
        else
        {
            str =str+(Character.toLowerCase(a));
        }

    }
    System.out.println(str);
}
}