package pl.sdacademy.designpatterns.Proxy;

import pl.sdacademy.designpatterns.Proxy.security.*;

import java.time.LocalDate;


public class ProxyDemo {
    public static void main(String[] args) {
        final ConfigLoader configLoader = new ConfigLoaderProxy (new DatabaseConfigLoader("jdbs:h2:mem:testdb"));

        configLoader.load();
        configLoader.load();
        configLoader.load();

        final long timeStamp = System.currentTimeMillis();
        final long msInYear = 365L * 24 * 60 * 60 * 1000;
        System.out.println(timeStamp / msInYear);

        final Person admin = new Person( "Andrzej", "admin@gmail.com", "1241351", LocalDate.now(),
                Role.ADMIN, 2, true);
        final Person user = new Person("Michal", "miki@gmail.com", "242643636", LocalDate.now(),
                Role.USER, 0 , false);

        final PersonalManager personalManager = new PersonalManagerProxy( new SimplePersonalManager(),admin);
        personalManager.addPerson(admin);

        personalManager.getAllPeople().forEach(System.out::println);
    }
}
