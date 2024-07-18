//package Inheritance;
class Demo21{
    String name = "Jyotipraksh";
    int age = 21;

    void disp()
    {
        System.out.println(" Demo1 " +  age + name );
    }
}
class Demo22 extends Demo21 
{

}
class Demo23 extends Demo22
{
}
public class pr1 {
    public static void main(String[] args) {
        Demo23 d = new Demo23();
        d.disp();
    }
}
