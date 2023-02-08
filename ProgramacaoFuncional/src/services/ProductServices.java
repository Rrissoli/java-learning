package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductServices {
    public double sumAlProducts(List<Product> list){
        double sum = 0;
        for (Product product : list) {
            sum += product.getPrice();
        }
        return sum;
    }
    public double filteredPrice(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for (Product product : list) {
            if(criteria.test(product)){
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
