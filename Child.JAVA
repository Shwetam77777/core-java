interface NewInterface1 {
    int a=1000;
    void expend();
}
interface NewInterface2 {
    int a=2000;
    void expend();
}
class Child implements NewInterface1, NewInterface2{
    public void expend(){
        int a=NewInterface1.a+NewInterface2.a;
        System.out.println(a);
    }
    public static void main (String[]ar){
        Child c = new Child();
        c.expend();
    }
}