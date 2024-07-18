
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
class FighterPlane extends Plane{
    public void fly(){
        System.out.println("FighterPlane is flies at high height");
    }
    public void CarryPassenger(){
        System.out.println("Fighterplane carries missile");
    }
}
class Airport{
    public void permit(Plane plane){
        plane.takeoff();
        plane.fly();
        plane.landing();
    }
}
public class pro2 {
    public static void main(String[] args) {
        CargoPlane cp =new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        Airport a= new Airport();
        a.permit(cp);
        a.permit(pp);
        a.permit(fp);
    }
}
