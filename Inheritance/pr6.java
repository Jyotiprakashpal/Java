class parentt
{
    int a,b,c;
    parentt(){//constuctor
        a=10;
        b=20;
        System.out.println("Parent constuctor");
    }
    parentt(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("parent parametorized constuctor ");
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}
class childd extends parentt{
    int x,y;
    childd(){
        super();
        x =100;
        y =200;
    }
    childd(int x,int y){
        super(x,y);
        this.x = x;
        this.y = y;
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
public class pr6 {
    public static void main(String[] args) {
        childd ch = new childd();
        ch.disp();
        childd ch1 = new childd(1000,2000);
        ch1.disp();
    }
}
