abstract class Loan{
    abstract public void dispInt();
    public void welcomNote(){
        System.out.println("Welcome to Pal Bank");
    }
}
class HomeLoan extends Loan{
    public void dispInt() {
        System.out.println("RI is 12%");
    }
}
class EducationLoan extends Loan{
    public void dispInt() {
        System.out.println("RI is 10%");
    } 
}
public class pro2 {
    public static void main(String[] args) {
        //Loan loan = new Loan();
        //we cannot crate the object of abstract class
        Loan loan = new HomeLoan();
        loan.dispInt();
        loan.welcomNote();

        Loan loan1 = new EducationLoan();
        loan1.dispInt();
        loan1.welcomNote();
    }
}
