class Demo1{
    void disp(){
        System.out.println("Demo is parent");
    }
    public void disp2(){
        System.out.println("");
    }
    public int add(){
        return 10+2;
    }
    public int add(int a,int b){
        return a + b;
    }
}
class Demo2 extends Demo1{
    public void disp(){//we can increase the visibility  
    }
//     void disp2(){//we can not decrease the visibility

//      }
//     public void add(){//return type cannot be changed
//         System.out.println("Child");
//     }
    public int add(int a){//rule-4 Method overriden
        return a ;
    }
}
public class pr9 {
    public static void main(String[] args) { 
    }
}
