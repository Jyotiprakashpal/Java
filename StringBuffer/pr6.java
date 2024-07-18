public class pr6 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer(1000);
        System.out.println(a.capacity());
        a.append("sachin");
        System.out.println(a.capacity());
        a.trimToSize();
        System.out.println(a.capacity());

    }
}
