package pl.sdacademy.designpatterns.factory.builder;

public class builderDemo {
    public static void main(String[] args) {
        final Player player = new Player.Builder().withHealth(100).withMana(100).withLevel(1).withNick("Tanniko").build();
        System.out.println(player);
    }
    }

