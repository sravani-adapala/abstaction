package abstractdemo;

import model.DrivingType;
import model.FuelType;
import model.SoundSystem;

public  class SafariBasic extends Car{


    @Override
    public SoundSystem soundSystem() {
        return new SoundSystem("250 watts");
    }

    @Override
    public FuelType fuelType() {
        return new FuelType("Petrol");
    }

    @Override
    public DrivingType drivingType() {
        return new DrivingType("manual");
    }
}
