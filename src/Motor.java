
interface Vehicle{
    String getVehicleType();
    int noOfWheels();
    int maxSpeed();
}
class Bus implements Vehicle{ //implements keyword is used to inheriting the interfaces from a  Vehicle class
    public String getVehicleType(){// overriding
        return "TATA & BS6";
    };
    public int noOfWheels(){
        return 10;
    };
    public int maxSpeed(){
        return 80;
    };
}





class Motor {
    public static void main(String[] args) {
        Vehicle bus =new Bus();
        System.out.println("Vehicle Type: "+bus.getVehicleType());
        System.out.println("No of Wheels: "+ bus.noOfWheels());
        System.out.println("Max Speed: "+ bus.maxSpeed());

    }
}
