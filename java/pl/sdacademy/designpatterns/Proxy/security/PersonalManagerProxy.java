package pl.sdacademy.designpatterns.Proxy.security;

import java.util.Collections;
import java.util.List;

public class PersonalManagerProxy implements PersonalManager {

    private PersonalManager personalManager;
    private Person managingPerson;

    public PersonalManagerProxy(PersonalManager personalManager, Person managingPerson) {
        this.personalManager = personalManager;
        this.managingPerson = managingPerson;
    }

    @Override
    public void addPerson(Person person) {
        if (hasAccessType(AccessType.WRITE)) {
            personalManager.addPerson(person);
        }
    }

    @Override
    public void deletePerson(String email) {
        if (hasAccessType(AccessType.WRITE)) {
            personalManager.deletePerson(email);
        }
    }

    @Override
    public List<Person> getAllPeople() {
        if (hasAccessType(AccessType.READ)) {
            return personalManager.getAllPeople();
        }
        return Collections.emptyList();
    }

    @Override
    public boolean isPersonPresent(String name) {
        if (hasAccessType(AccessType.READ)) {
            personalManager.isPersonPresent("present");
        }return false;
    }
    @Override
    public void validateEmail(String email) {
        if (hasAccessType(AccessType.WRITE)) {
            personalManager.validateEmail(email);
        }
    }
    private boolean hasAccessType(final AccessType accessType){
        return  (managingPerson.getRole().getAccessTypes().contains(accessType));
    }
}
