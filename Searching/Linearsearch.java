import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) 
    {
        int [] ar ={10,20,30,40,50,60,70,80};
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The key to be searched ");
        int key = scan.nextInt();
        for(int i=0;i<ar.length;i++)
        {
            if(key==ar[i])
            {
                System.out.println("key " + key +"Found at index "+ i);
                flag = true;
                break;
            }
        }
        if (flag == false)
        {
            System.out.println("Key not found");
        }
    }
}
