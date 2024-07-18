class op1 {
    public static void main(String[] args)
    {
        int a=10;
        int b=2;

       if(a>b)
       {
            if(a==10)
            {
                System.out.print("Substraction :"); 
                System.out.println(a-b);
            }
            else
            {
                System.out.println("A is greater but not equal to 10 ");
            } 
       }
       else if(a==b)
       {
        System.out.println("addition :");
        System.out.println(a+b);
       }
       else if(a<b)
       {
        System.out.println("a is lesser :");
       }
       else
       {
        System.out.println("a is lesser");
       }
    }
}
