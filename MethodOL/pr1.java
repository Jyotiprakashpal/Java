class calculator2{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    float add(int a,float b)
    {
        return a+b;
    }
}
public class pr1 {
    public static void main(String[] args) {
        calculator2 calc = new calculator2();
        System.out.println(calc.add(10,20));
    }
}

 