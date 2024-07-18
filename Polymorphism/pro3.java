
class parents{
    public void cry(){
        System.out.println("Parents Crying");
    }
}
class child11 extends parents{
    public void cry(){
        System.out.println("Child1 Crying");
    }
    public void eat(){
        System.out.println("Child1 Eat less");
    }
}
class child12 extends parents{
    public void cry(){
        System.out.println("Child2 Crying");
    }
    public void eat(){
        System.out.println("Child2 Eat more");
    }
}
public class pro3 {
    public static void main(String[] args) {
        parents p = new child11();
        p.cry();
        //p.eat();  //Directly using the parent type ref you cannot acess the child
        ((child11) p).eat(); //downcasting
        parents p2 = new child12();
        p2.cry(); 
        //p2.eat();
        ((child12)p2).eat();
    }
}
