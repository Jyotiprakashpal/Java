public class op5_switch {
    public static void main(String[] args) {
        int number=100;
        switch(number)
        {
            case 10:
                System.out.println("1st case");
                break;
            case 20:
                System.out.println("2nd case");
                break;
            case 100:
                System.out.println("3rd case");
                break;
            default:
                System.out.println("no case matches");
        }
    }
}
