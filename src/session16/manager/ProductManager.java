package session16.manager;

import session16.model.Product;

import java.util.ArrayList;

public class ProductManager implements IManager<Product>{
    private ReadAndWriteProductList readAndWriteProductList;
    private ArrayList<Product> products;

    public ProductManager() {
        readAndWriteProductList = new ReadAndWriteProductList();
        products = readAndWriteProductList.readFile();
    }
    @Override
    public void add(Product products) {
        this.products.add(products);
    }

    @Override
    public void edit(int id, Product newProduct) {
        int index = findById(id);
        this.products.set(index, newProduct);
    }

    @Override
    public void delete(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
            }
        }
    }

    @Override
    public ArrayList<Product> showAll() {
        return products;
    }

    public int findById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == this.products.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
}
