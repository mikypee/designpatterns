package pl.sdacademy.designpatterns.adapter;

import pl.sdacademy.designpatterns.adapter.SystemA.SystemAUser;
import pl.sdacademy.designpatterns.adapter.SystemA.SystemAUserAdapter;
import pl.sdacademy.designpatterns.adapter.SystemB.SystemBUser;
import pl.sdacademy.designpatterns.adapter.SystemB.SystemBUserAdapter;


import java.util.Collections;

public class AdapterDemo {
    public static void main(String[] args) {
        final SystemAUser systemAUser = new SystemAUser("Michal", "Pierzyna", 29 ,
                Collections.singletonList("User"));
        final SystemBUser systemBUser = new SystemBUser( " Andrzej Nowak", "Endrju","34",
                Collections.singleton("Admin"));
        final User userA = new SystemAUserAdapter(systemAUser);
        final User userB = new SystemBUserAdapter(systemBUser);
        System.out.println(userA.getFullname());
        System.out.println(userA.getRoles());
        System.out.println(userB.getFullname());
        System.out.println(userB.getAge());
        System.out.println(userB.getRoles());
        System.out.println(userB.getUsername());
    }
}
