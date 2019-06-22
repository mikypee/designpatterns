package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        final Counter counterA = Counter.getInstance();
        final Counter counterB = Counter.getInstance();

        counterA.addOne();
        counterA.addTwo();
        counterB.addThree();
        counterB.addTwo();

        final AppConnections appConnectionsA = AppConnections.getInstance();
        final AppConnections appConnectionsB = AppConnections.getInstance();
        appConnectionsA.connectUser("Andrzej");
        appConnectionsB.connectUser("Michal");
        appConnectionsA.getConnectedUsers().forEach(System.out::println);

        final SingletonEnum enumSingletonA = SingletonEnum.INSTANCE;
        final SingletonEnum singletonEnumB = SingletonEnum.INSTANCE;
    }
}
