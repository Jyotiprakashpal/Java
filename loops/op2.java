//Nested if-else statment
class op2 
{
     public static void main(String[] args) {
        
        int a= 10;
        int b= 20;
        int c= 30;

        
        if(a<b)
        {
            if(a<c)
            {
                System.out.println("A is least :" +a);
            }
            else
            {
                System.out.println("C is least :" +c);
            }
        }
        else if(b<c)
        {
            System.out.println("B is least :"+b);
        }
        else
        {
            System.out.println("C is least"+c);
        }      
     }   
}
