public class pr7 {
    public static void main(String[] args) {
        String name = "sachi";
        String data = name.toUpperCase();
        int count = data.length();
        System.out.println(count);
        //method chaining
        System.out.println(name.toUpperCase().length());
        StringBuffer a = new StringBuffer("virat");
        //method chaning
        a.append("kohli").
        insert(10, "anushka").
        reverse().
        append("IND").
        insert(a.length(),"RCB").
        reverse().delete(0, 6);        
        System.out.println(a);
    }
}
