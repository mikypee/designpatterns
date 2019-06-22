package pl.sdacademy.designpatterns.Proxy;

public class DatabaseConfigLoader implements ConfigLoader{
    private String configuration;
    private String serverUrl;

    public DatabaseConfigLoader(final String serverUrl) {
        this.serverUrl = serverUrl;

    }

    @Override
    public String load() {
        System.out.println("getting config from " + serverUrl);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        configuration = "config loaded from " + serverUrl;

        return configuration;

    }
}
