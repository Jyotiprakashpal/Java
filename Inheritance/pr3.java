//package Inheritance;
class Demo31{
    String name = "Jyotipraksh";
    int age = 21;

    void disp()
    {
        System.out.println(" Demo1 " +  age + name );
    }
}
class Demo32 extends Demo31{
}
class Demo33 extends Demo31{
} 
class Demo34 extends Demo32{

}
public class pr3 {
    public static void main(String[] args) {
       Demo34 d = new Demo34();
        d.disp(); 
    }
}
