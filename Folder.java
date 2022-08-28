import java.io.*;
import java.util.Scanner;
public class Folder{
    public static void main(String[] args) throws IOException {
       try{
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the Foldername");
      String fname=sc.nextLine();
      File f=new File(fname);
      if(!f.exists())
      {
          f.mkdir();
          System.out.println("foider created...");}
          else{
                  System.out.println("folder already exist");
                  }
      }
       catch(Exception ex){
    
       System.out.println(ex);
       }
      
    }
}