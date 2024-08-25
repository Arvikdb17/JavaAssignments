package Interfaces;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface RemoteControlCar {
    void drive();
    int getDistanceTravelled();
}

class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar> {

    int distanceTravelled=0;
    int victories=0;
    public void drive() {
        this.distanceTravelled+=10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories=numberOfVictories;
    }
    public int compareTo(ProductionRemoteControlCar prc){
        return Integer.compare(this.victories,prc.victories);
    }
}
class ExperimentalRemoteControlCar implements RemoteControlCar {
    int distanceTravelled=0;
    public void drive() {
        this.distanceTravelled+=20;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {

        Comparator<ProductionRemoteControlCar> com=new Comparator<ProductionRemoteControlCar>()
        {
            public int compare(ProductionRemoteControlCar t1, ProductionRemoteControlCar t2)
            {
                if(t1.getNumberOfVictories() < t2.getNumberOfVictories())
                {
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(cars, com);
        return cars;
    }
}