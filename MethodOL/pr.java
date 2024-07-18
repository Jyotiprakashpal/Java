
class calculator1{
    int a,b,c;
    void add(){
        a=10;
        b=20;
        c=a+b;
        System.out.println(c);
    }
}

public class pr {
    public static void main(String[] args) {
        calculator1 calc =new calculator1();  
        calc.add();  
    }
}
