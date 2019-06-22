package pl.sdacademy.designpatterns.Proxy.security;

import java.util.List;

public interface PersonalManager {
    void addPerson(Person person);
    void deletePerson(String email);
    List<Person> getAllPeople();
    boolean isPersonPresent(String name);
    void validateEmail(String email);
}
