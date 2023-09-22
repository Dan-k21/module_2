package session9.manager;

public interface IManager<Person> {
    void add(Person person);
    void delete(int id);
    void edit(int id, Person newPerson);
    Person[] findAll();
}
