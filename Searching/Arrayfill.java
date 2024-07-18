import java.util.Arrays;

public class Arrayfill {
    public static void main(String[] args) {
        int [] a= {2,3,0,0,0,7};
        Arrays.fill(a, 2,5,10);
        for(int elem:a)
        {
            System.out.print(elem + " ");
        }
    }
}
