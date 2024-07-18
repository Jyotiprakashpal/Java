import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] [] [] love = new int [2][3][3];

        for(int i=0;i<love.length;i++)
        {
            for(int j=0;j<love[i].length;j++)
            {
                for(int k=0;k<love[i][j].length;k++)
                {
                    System.out.println("Marks of college" + i + "Class" + j + " Student" + k);
                    love [i][j][k] =scan.nextInt();
                }
            }
        }
        System.out.println("Marked store as follows");
        for(int i=0;i<love.length;i++)
        {
            for(int j=0;j<love[i].length;j++)
            {
                for(int k=0;k<love[i][j].length;k++)
                {
                    System.out.print(love[i][j][k] +" ");
                }
                System.out.println();
            }
        }
    }
}
