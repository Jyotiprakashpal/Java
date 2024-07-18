import java.util.Arrays;
public class Arraysort {
    public static void main(String[] args) {
        int [] ar = {10,60,30,70,20,34,56};
        Arrays.sort(ar);
        for( int elem:ar)
        {
            System.out.print(elem + " ");
        }
        System.out.println();

        int res = Arrays.binarySearch(ar, 7);
        System.out.println(res);
    }
}
