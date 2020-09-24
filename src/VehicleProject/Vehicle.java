package VehicleProject;

public class Vehicle implements VehicleInter {
    private int passengers; // количество пассажиров
    private int fuelcap; // емкость топливного бака
    private int mpg; // потребление топлива в милях на галлон

    Vehicle(int p, int f, int m) {//конструктор
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    public int range() {//определение дальности поездки
        return mpg * fuelcap;
    }

    public double fuelneeded(int miles) {//расчет топлива
        return (double) miles / mpg;
    }
}
