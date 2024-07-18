public class pr93 {
    public static void main(String[] args) {
        String name = "sachin IND";
        System.out.println(name.length());//10
        System.out.println(name.trim());//sachin IND

        System.out.println();
        String state = "  odisha   ";
        System.out.println(state.length());//11
        System.out.println(state.trim());//odisha
        System.out.println(state.trim().length());
    }
}
