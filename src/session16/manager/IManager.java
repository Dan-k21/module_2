package session16.manager;

import java.util.ArrayList;
import java.util.List;

public interface IManager<P> {
    boolean add(P products);
    boolean edit(int id, P newProduct);
    boolean delete(int id);
    List<P> showAll();
}
