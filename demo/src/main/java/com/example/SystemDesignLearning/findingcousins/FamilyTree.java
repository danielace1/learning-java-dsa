package com.example.SystemDesignLearning.findingcousins;

import java.util.ArrayList;
import java.util.List;

import com.example.SystemDesignLearning.findingcousins.models.Person;

public class FamilyTree {
    List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public Person findPersonByName(String name) {
        for (Person person : persons) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    public Person findPersonById(int id) {
        for (Person person : persons) {
            if (person.getPersonId() == id) {
                return person;
            }
        }
        return null;
    }

    public List<Person> findCousins(String name) {
        List<Person> cousins = new ArrayList<>();

        Person inputPerson = findPersonByName(name);

        if (inputPerson == null) {
            return cousins;
        }

        Person father = findPersonById(inputPerson.getFatherId());
        Person mother = findPersonById(inputPerson.getMotherId());

        // father's side
        if (father != null) {
            findChildrenOfSiblings(father, cousins);
        }

        // mother's side
        if (mother != null) {
            findChildrenOfSiblings(mother, cousins);
        }

        return cousins;
    }

    private void findChildrenOfSiblings(Person parent, List<Person> cousins) {

        if (parent.getFatherId() == 0 || parent.getMotherId() == 0) {
            return;
        }

        int grandFather = parent.getFatherId();
        int grandMother = parent.getMotherId();

        for (Person sibling : persons) {
            if (sibling.getFatherId() == grandFather && sibling.getMotherId() == grandMother
                    && sibling.getPersonId() != parent.getPersonId()) {
                for (Person child : persons) {
                    if (child.getFatherId() == sibling.getPersonId() || child.getMotherId() == sibling.getPersonId()) {
                        cousins.add(child);
                    }
                }
            }
        }

    }
}
