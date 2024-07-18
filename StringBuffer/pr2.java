public class pr2 {
    public static void main(String[] args) {
        StringBuffer jyoti = new StringBuffer("abcdefg");
        jyoti.insert(3,"xyz");
        jyoti.insert(9,11);
        System.out.println(jyoti);
        jyoti.insert(jyoti.length(),"dhoni");
        System.out.println(jyoti);

    }
}
