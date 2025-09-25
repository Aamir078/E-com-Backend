package com.Aamir.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

   @Id
   private int prodId;
   private int Prize;
   private String ProdName;

   public Product(){}

    public Product(int prodId, String prodName, int prize) {
        this.prodId = prodId;
        Prize = prize;
        ProdName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getPrize() {
        return Prize;
    }

    public void setPrize(int prize) {
        Prize = prize;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("prodId=").append(prodId);
        sb.append(", Prize=").append(Prize);
        sb.append(", ProdName='").append(ProdName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
