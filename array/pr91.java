//wap to find th max term of the array
public class pr91 {
    public static void main(String[] args) {
        int [] a = {25,30,40,70,10};
        int max = a[0];
        for(int i= 0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println("the max term is "+ max);
    }
}
