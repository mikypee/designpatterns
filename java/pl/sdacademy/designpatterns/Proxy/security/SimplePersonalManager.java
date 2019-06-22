package pl.sdacademy.designpatterns.Proxy.security;

import java.util.ArrayList;
import java.util.List;

public class SimplePersonalManager implements PersonalManager{

    private List<Person> users = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
        final boolean emailExists = users.stream().anyMatch(p -> p.getEmail().equalsIgnoreCase(person.getEmail()));
        if (!emailExists) {
            users.add(person);
        } else {
            throw new RuntimeException("User with this email already exists");
        }
    }
    @Override
    public void deletePerson(String email) {
        //final Optional<Person> personToDelete =
        users.stream()
                .filter(p -> p.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .ifPresent(p -> users.remove(p));
    }

    @Override
    public List<Person> getAllPeople() {
        return users;
    }

    @Override
    public boolean isPersonPresent(String name) {
        return users.stream()
        .anyMatch(p -> p.getName().equalsIgnoreCase(name));
    }

    @Override
    public void validateEmail(String email) {
         users.stream()
                .filter(p -> p.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .ifPresent(p -> p.setVerified(true));

    }
}
