import Polymorphism.CargoPlane;
import Polymorphism.PassengerPlane;
import Polymorphism.Plane;

class Plane{
    public void takeoff(){
        System.out.println("Plane is taking off");
    }
    public void fly(){
        System.out.println("Plane is flying");
    }
    public void landing(){
        System.out.println("Plane is Landing");
    }
}
class CargoPlane extends Plane{
    public void fly(){
        System.out.println("CargoPlane is flies at lower height");
    }
    public void CarryGoods(){
        System.out.println("Cargoplane carries goods");
    }
}
class PassengerPlane extends Plane{
    public void fly(){
        System.out.println("PassengerPlane is flies at medium height");
    }
    public void CarryPassenger(){
        System.out.println("Passengerplane carries Passenger");
    }
}
public class pr7 {
    public static void main(String[] args) {
        CargoPlane cp =new CargoPlane();
        PassengerPlane pp = new PassengerPlane();

        cp.takeoff();//inherited method
        cp.fly();//specialized method
        cp.CarryGoods();//overriden method
        cp.landing();//inherited method

        pp.takeoff();
        pp.fly();
        pp.CarryPassenger();
        pp.landing();
    }
}
