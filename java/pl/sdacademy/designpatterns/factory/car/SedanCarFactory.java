package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class SedanCarFactory implements AbstractFactory<Car> {
    @Override
    public Car create(final String type){
        switch (type){
            case " TCS ":
                return createCorollaSedan();
            case " A4S ":
                return createAudiSedan();
        }
        throw new RuntimeException("Unknown sedan type");
    }
    private Car createCorollaSedan(){
        return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
                1.6D, 4, BodyType.SEDAN);
    }
    private Car createAudiSedan(){
        return new Audi("A4", EngineType.DIESE, 2.0D,4,BodyType.SEDAN);
    }
}
