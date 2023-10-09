package session16.manager;

import session16.model.Product;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteProductList {
    File file = new File("product.csv");

    public void writelist(ArrayList<Product> products) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Product product : products) {
                line += product.getId() + "," + product.getName() + "," + product.getPrice() + "," + product.getCategory() + "\n";

            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Product> readFile() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Product product = new Product(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), (int) Double.parseDouble(data[3]), data[4]);
                products.add(product);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return products;
    }
}
