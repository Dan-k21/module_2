package session16.manager;

import java.util.ArrayList;

public interface IManager<P> {
    void add(P products);
    void edit(int id, P newProduct);
    void delete(int id);
    ArrayList<P> showAll();
}
