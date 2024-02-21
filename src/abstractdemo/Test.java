package abstractdemo;

import model.DrivingType;
import model.FuelType;
import model.SoundSystem;

public class Test {
    public static void main(String[] args) {

        Car safariBasic = new SafariBasic();

        SoundSystem soundSystem = safariBasic.soundSystem();
        System.out.println(" Basic car frequency" + soundSystem);
        DrivingType drive = safariBasic.drivingType();
        System.out.println("Basic car driving" + drive);


        Car safariTopEnd = new SafariTopEnd();

        SoundSystem soundSystem1 = safariTopEnd.soundSystem();
        System.out.println(" Top end car frequency" + soundSystem1);
        FuelType fuel = safariTopEnd.fuelType();
        System.out.println("Topend Fueltype" + fuel);


    }
}