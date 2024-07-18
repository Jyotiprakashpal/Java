public class pr3 {
    public static void main(String[] args) {
        String a1= "iNuron";
        String a2 = "";
        for(int i=a1.length()-1;i>=0;i--){
            a2=a2+a1.charAt(i);
        }
        System.out.println("Original String " +a1);
        System.out.println("After Reversing " +a2);
    }
}
