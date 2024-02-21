package abstractdemo;

import model.*;

import java.util.function.Function;

public abstract class Car{

    public Colour colourName(Colour colour){
        return colour;
    }
    public Engine engineType(Engine engine){
        return engine;

    }

    public abstract SoundSystem soundSystem();
    public abstract FuelType fuelType();
    public abstract DrivingType drivingType();


}
