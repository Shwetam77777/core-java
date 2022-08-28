abstract class MyAbs{
public abstract void calc(int a);
public void myprint(){
System.out.println("print method called");
}}
class Shweta extends MyAbs{
public void calc(int a){
System.out.println("sq is:"+(a*a));
}
public void myprint(){
System.out.println("Shweta myprint");
}
}
class Ram extends MyAbs{
public void calc(int a){
System.out.println("cube is:"+(a*a*a));
}

public static void main (String[]ar){
Shweta s=new Shweta();
Ram r=new Ram();
s.myprint();
s.calc(4);
r.myprint();
r.calc(4);
}
}
