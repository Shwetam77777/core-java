import java.util.*;
class Home{
public static float TriaArea(float l, float b){
return((float)(l*b)*1/2);
}
public static float TriaPeri(float l, float b,float h){
return(l+b+h);}
public static float RectArea(float l ,float b){
return(l*b);
}
public static float RectPeri(float l ,float b){
return(2*(l+b));
}
public static void main (String[]ar){
Scanner sc =new Scanner(System.in);
System .out.println("Enter lenth and breath and height of triangle");
float l=sc.nextFloat();
float b=sc.nextFloat();
float h=sc.nextFloat();

System.out.println("AreaTria is:"+TriaArea(l,b));
System.out.println("PerimeterTria is:"+TriaPeri(l,b,h));
System.out.println("AreaRect is:"+RectArea(l,b));
System.out.println("PerimeterRect is:"+RectPeri(l,b));
}}