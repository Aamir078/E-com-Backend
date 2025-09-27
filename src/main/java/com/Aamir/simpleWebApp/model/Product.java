package com.Aamir.simpleWebApp.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.Date;

@Component
@Entity
public class Product {


   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
   private int id;
   private String name;
   private String description;
   private String brand;
   private double price;
   private String category;

//   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
   private Date releaseDate;
   private boolean available;

   private String imageName;
   private String imageType;
   // when you are working with large data and want to store in
   // database you have to use Annotation like large object
   @Lob
   private byte[] imageDate;

   public Product(){}

    public Product(int id, String name, String description,
                   String brand, double price, String category,
                   Date releaseDate, boolean available, String imageName,
                   String imageType, byte[] imageDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.releaseDate = releaseDate;
        this.available = available;
        this.imageName = imageName;
        this.imageType = imageType;
        this.imageDate = imageDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getImageDate() {
        return imageDate;
    }

    public void setImageDate(byte[] imageDate) {
        this.imageDate = imageDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append(", category='").append(category).append('\'');
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", available=").append(available);
        sb.append(", imageName='").append(imageName).append('\'');
        sb.append(", imageType='").append(imageType).append('\'');
        sb.append(", imageDate=").append(Arrays.toString(imageDate));
        sb.append('}');
        return sb.toString();
    }
}
