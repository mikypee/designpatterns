package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusBeforeLoggingDecorator implements EngineStarter {

    private EngineStarter engineStarter;

    public CarEngineStatusBeforeLoggingDecorator(final EngineStarter engineStarter) {
        this.engineStarter = engineStarter;
    }


    @Override
    public void startEngine() {
        System.out.println(" Engine will start in a second");
        engineStarter.startEngine();
    }

    @Override
    public void stopEngine() {
        System.out.println(" Engine will stop in a second");
        engineStarter.stopEngine();
    }
}
