import java.util.Scanner;

class Farmer{
    private float PA;
    private float TD;
    private float SI;
    private float RI;

    void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly Enter The Principal Amount");
        PA = scan.nextFloat();
        System.out.println("Kindly mention time duration required");
        TD = scan.nextFloat();
        RI = 2.5f;
    }
    void compute()
    {
        SI = (PA*TD*RI)/100;
    }
    void disp()
    {
        System.out.println("SI is " + SI);
    }
}
public class pr2 {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();

        f1.input();
        f1.compute();
        f1.disp();

        f2.input();
        f2.compute();
        f2.disp();
    }
}
