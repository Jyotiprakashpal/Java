//package Inheritance;
class Demo1{
    String name = "Jyotipraksh";
    int age = 21;

    void disp(){
        System.out.println(" Demo1 " +  age + name );
    }
}
class Demo2 extends Demo1 //inheritance
{                  

}
//Demo2 is derived/sub/child class
//Demo1 is parent/base/existing
public class pr{
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        demo.disp(); 
    }
}
