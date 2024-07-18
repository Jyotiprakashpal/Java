import java.util.Scanner;
abstract class Shapes{
    float area;
    abstract public void input();
    abstract public void compute();
    public void disp(){
        System.out.println("The area is " + area);
    }
}
class Rectangle extends Shapes{
    float length;
    float breadth;
    //float area;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the Rectangle");
        length = scan.nextFloat();
        System.out.println("Please enter the breadth of the Rectangle");
        breadth = scan.nextFloat();
    }
    public void compute(){
        area = length * breadth ;
    }
    /*public void disp(){
        System.out.println("The area is " + area);
    } */
}
class Square extends Shapes{
    float length;
    //float area;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the squaree");
        length = scan.nextFloat();
    }
    public void compute(){
        area = length * length ;
    }
    /* public void disp(){
        System.out.println("The area is " + area);
    } */
}
class Circle extends Shapes{
    float radius;
    final float pi = 3.141f;
    //float area;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius of the Circle");
        radius = scan.nextFloat();
    }
    public void compute(){
        area = pi * radius * radius;
    }
    /*public void disp(){
        System.out.println("The area is " + area);
    }*/
}
class Geometry{
    void permit(Shapes s){
        s.input();
        s.compute();
        s.disp();
    }
}
class project{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Square s = new Square();
        Circle c = new Circle();
        Geometry g = new Geometry();
        g.permit(r);
        g.permit(s);
        g.permit(c);
        /*r.input();
        r.compute();
        r.disp();

        s.input();
        s.compute();
        s.disp();

        c.input();
        c.compute();
        c.disp();*/
    }
}