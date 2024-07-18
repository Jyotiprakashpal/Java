// final class vehicle{ //final class --> Doesnot participate in inheritance
//     void disp(){
//         System.out.println("vehicle");
//     }
// }
// class car extends vehicle{//final class we cannot inherit
//         
// }

class vehicle{
    final int i = 10 ;
    final void disp(){  //final method-->participate in inheritance
       // i = 20; final variable act as a constant we cannot change the value
        System.out.println(i);
        System.out.println("vehicle");
        }
    }
class car extends vehicle{
  /*  void disp(){      //final method-->participate in inheritance But cannot overrriden
        System.out.println("disp");
    }  */
}
public class pr91final {
    public static void main(String[] args) {
        car c = new car();
        c.disp();
    }
}
