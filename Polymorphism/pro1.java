class parent1{
    public void cry(){
        System.out.println("Parent crying");
    }
}
class child1 extends parent1 {
    public void cry(){
        System.out.println("Child1 cries at low voice");
    }
}
class child2 extends parent1 {
    public void cry(){
        System.out.println("Child2 cries at high voice");
    }
}
public class pro1 {
    public static void main(String[] args) {
        child1 c1 = new child1();
        //parent1 ineuron = new child1();
        child2 c2 = new child2();

        // c1.cry();
        // c2.cry();
        parent1 ref;
        ref = c1;
        ref.cry(); //1:M

        ref = c2;
        ref.cry(); //1:M
    }
}
