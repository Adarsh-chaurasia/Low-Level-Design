package NullDesignPattern;

public class Main {

    public static void main(String[] args){

        String vehivle = "";

        Vehicle vh = VehicleFactory.getVehicleObject(vehivle);
        System.out.println(vh.getMaxSpeed());
        System.out.println(vh.getNoOfWheels());

    }

}
