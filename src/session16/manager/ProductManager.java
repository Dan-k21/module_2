package session16.manager;

import session16.dao.ReadAndWriteProductList;
import session16.model.Product;
import java.util.List;

public class ProductManager implements IManager<Product>{
    List<Product> productList;
    ReadAndWriteProductList readAndWriteProductList = new ReadAndWriteProductList();

    public ProductManager() {
        this.productList = readAndWriteProductList.readFile();
    }
    @Override
    public boolean add(Product products) {
        this.productList.add(products);
        readAndWriteProductList.writelist(this.productList);
        return true;
    }

    @Override
    public boolean edit(int id, Product newProduct) {
        int index = findById(id);
        if (index == -1) return false;
        this.productList.set(index, newProduct);
        readAndWriteProductList.writelist(this.productList);
        return true;
    }

    @Override
    public boolean delete(int id) {
        int index = findById(id);
        if (index == -1) return false;
        this.productList.remove(index);
        readAndWriteProductList.writelist(this.productList);
        return true;
    }

    @Override
    public List<Product> showAll() {
        return this.productList;
    }

    public int findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == this.productList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
}
