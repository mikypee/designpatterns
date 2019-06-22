package pl.sdacademy.designpatterns.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        final ConfigLoader configLoader = new ConfigLoaderProxy (new DatabaseConfigLoader("jdbs:h2:mem:testdb"));

        configLoader.load();
        configLoader.load();
        configLoader.load();

    }
}
