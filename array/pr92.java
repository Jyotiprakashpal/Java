public class pr92 {
    public static void main(String[] args) {
        int [] a ={10,43,54,23,8};
        int min = a[0];
        for(int i= 0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("the min term is "+ min);
    }
}
