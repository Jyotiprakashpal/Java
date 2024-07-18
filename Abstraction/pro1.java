abstract class Plane{
    //abstract int a;//abstract keyword cannot apply to a variable
    abstract public void takeoff();
    abstract public void fly();
    abstract public void landing();
    public void Airport(){
        System.out.println("All plane needs airport");
    }
}
class CargoPlane extends Plane{
    public void takeoff(){
        System.out.println("cargoplane needs lager runway for takeoff");
    }
    public void fly(){
        System.out.println("CargoPlane is flies at lower height");
    }
    public void landing(){
        System.out.println("Cargoplane needs lager runway for landing");
    }
}
class PassengerPlane extends Plane{
    public void takeoff(){
        System.out.println("Passengerplane needs medium runway for takeoff");
    }
    public void fly(){
        System.out.println("Passengerplane is flies at lower height");
    }
    public void landing(){
        System.out.println("Passengerplane needs medium run way for landing");
    }
}
class Airport{
    public void permit(Plane plane){
        plane.takeoff();
        plane.fly();
        plane.landing();
    }
}
public class pro1 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        Airport a = new Airport();
        a.permit(cp);
        a.permit(pp);
    }
}
