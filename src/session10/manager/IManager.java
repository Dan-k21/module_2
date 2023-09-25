package session10.manager;

import java.util.ArrayList;

public interface IManager<S> {
    void add(S student);
    void delete(int id);
    void edit(int id, S newStudent);
    ArrayList<S> showAll();
}
