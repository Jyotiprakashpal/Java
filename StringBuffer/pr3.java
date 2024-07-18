public class pr3 {
    public static void main(String[] args) {
        StringBuffer q = new StringBuffer("sachinrameshTtendulkar");
        System.out.println(q);
        q.delete(6, 12);
        System.out.println(q);
        q.deleteCharAt(7);
        System.out.println(q);
    }
}
