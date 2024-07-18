public class pr96 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();//1000 => capacity(if we write in the sqar)
        System.out.println(sb1.length());//no of character stored
        System.out.println(sb1.capacity());//how many no of character can be stored
        System.out.println();
        sb1.append("abcdefghijklmnop");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        System.out.println();
        sb1.append("q");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());//new capacity = (old capcity+1) * 2 = 34
    }
}
