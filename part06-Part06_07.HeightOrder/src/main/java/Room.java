import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    
    public Room () {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortHt = this.people.get(0);
        for (Person person: people) {
            if (person.getHeight() < shortHt.getHeight()) {
                shortHt = person;
            }
        }
        return shortHt;
    }
    
    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortPerson = this.shortest();
        
        this.people.remove(shortPerson);
        return shortPerson;
    }
}
