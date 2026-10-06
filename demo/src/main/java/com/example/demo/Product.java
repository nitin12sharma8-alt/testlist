package com.example.demo; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


@Entity 
public class Product {
@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;
private String  name; 
private String  description; 
private String  category; 
private Double price; 
private Long qty; 

@Lob
private byte[] image;

    public Product(String category, String description, Long id, byte[] image, String name, Double price, Long qty) {
        this.category = category;
        this.description = description;
        this.id = id;
        this.image = image;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }


}
