//Overriden Method
class loan{
    void disp(){
        System.out.println("Welcome to Pal Bank");
    }
}
class personaLoan extends loan{
    void disp(){
    System.out.println("Personal Loan app");
    }
}
public class pr8 {
    public static void main(String[] args) {
        personaLoan pl = new personaLoan();
        pl.disp();
    }
}
