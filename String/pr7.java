public class pr7 {
    public static void main(String[] args) {
        String s1 = new String("sachin");
        String s2 = s1.intern();
        System.out.println(s1==s2);//false

        String s3 = "sachin";
        System.out.println(s2==s3);//true
    }
}
