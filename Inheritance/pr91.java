class interest{

}
class interestPersonalLoan extends interest{

}

class Loan{
    public interest interest(){
        interest it = new interest();
        return it;
    }
}
class personaLoan extends Loan{
    public interestPersonalLoan interest(){
        interestPersonalLoan ipl = new interestPersonalLoan();
        return ipl;
    }
}
public class pr91 {
    public static void main(String[] args) {
        
    }
}
