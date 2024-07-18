import java.util.Scanner;
public class pr2 
{
    public static void main(String[] args) 
    {
     //to store and display marks of 5 students 
        int [] ar = new int[5];  
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<ar.length;i++)
        {
            System.out.println("please enter the marks of students" +i);
            ar[i] = scan.nextInt();
        }
        System.out.println("The marks of the student as follow ");
        for(int i=0;i<=ar.length;i++)
        {
            System.out.println(ar[i] + " ");
        }
    }    
}
