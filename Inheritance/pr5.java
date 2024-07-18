/**class Demo51 extends Demo52{

}
class Demo52 extends Demo51{//cyclic inheritance is not allowed in java

}**/
class parent51{
    //private String name;
    parent51(){
        System.out.println("Parent constuctor");
    }
    void disp()
    {
        System.out.println("Parent ");
    }
}
class child5 extends parent51{
    void disp2()
    {
        //name = "jyoti";
    }
}
public class pr5 {
    public static void main(String[] args) {
        child5 c = new child5();
        c.disp();
    }
}
