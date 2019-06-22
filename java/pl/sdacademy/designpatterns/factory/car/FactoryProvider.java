package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class FactoryProvider {
    public static AbstractFactory<Car> getFactory(final FactoryCategory factoryCategory) {
        switch (factoryCategory){
            case COMBIS:
                return new CombiCarFactory();
            case SEDANS:
                return new SedanCarFactory();
        }
        throw new RuntimeException(" Uknown factory category");
    }

}
