package VehicleProject;

public class Truck extends Vehicle{
    private  int cargocap;

    Truck(int p, int f, int m, int c){
        super(p, f, m);
        cargocap = c;
    }

    int getCargocap(){ return cargocap; }

    void putCargocap(int c){ cargocap = c; }
}
