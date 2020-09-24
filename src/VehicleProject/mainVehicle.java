package VehicleProject;

public class mainVehicle {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        VehicleInter car;
        car = pickup;

        double gallons;
        int dist = 252;
        gallons = semi.fuelneeded(dist);
        System.out.println(pickup.range());


    }
}
