package com.Aamir.simpleWebApp.service;
import com.Aamir.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>(List.of(
            new Product(101,"Iphone", 50000),
            new Product(102,"samsung", 25000),
            new Product(103, "nokia", 1000)
    ));

    public List<Product> getProduct(){
        return products;
    }

    public Product getProductById(int ProdId){

        return products.getFirst();
        // make your own logic for this
    }


    public Product getProductViaStream(int prodId){
        return products.stream().filter(product -> product.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product prod){
        int index = 0;
        while (index < products.size() && products.get(index).getProdId() < prod.getProdId()) {
            index++;
        }
        products.add(index, prod);
    }


    public void updateProduct(Product prod) {
        int index = binarySearch(0, products.size() - 1, prod, -1);
        if (index != -1) {
            products.set(index, prod);
        } else {
            throw new RuntimeException("product not found!");
        }
    }

    int binarySearch(int start, int end, Product prod, int prodId) {

        if (prod != null){
            while (start <= end) {
                int mid = (start + end) >> 1;

                if (products.get(mid).getProdId() == prod.getProdId()) {
                    return mid;
                }

                if (products.get(mid).getProdId() < prod.getProdId()) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }else {
            while (start <= end) {
                int mid = (start + end) >> 1;

                if (products.get(mid).getProdId() == prodId) {
                    return mid;
                }

                if (products.get(mid).getProdId() < prodId) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;

    }

    public void deleteProduct(int prodId) {
        int index = binarySearch(0, products.size() - 1,null, prodId);

          if(index != -1){
              products.remove(index);
          }else {
              throw new RuntimeException("unexpected PRODUCT-ID found!...");
          }


    }
}

