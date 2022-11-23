package com.project.PetShop.Entity;

import javax.persistence.*;

@Entity
@Table
public class petsFoodEntity {
    @Id
    @SequenceGenerator(
            name="petfood_sequence",sequenceName = "petfood_sequence",allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="petfood_sequence")
    private Integer id;
    private String name;
    private Integer price;
    private String image;
    private Integer inStock;
    private Boolean fastDelivery;
    private Integer ratings;

    public petsFoodEntity() {
        super();
    }

    public petsFoodEntity(String name, Integer price, String image, Integer inStock, Boolean fastDelivery, Integer ratings) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.inStock = inStock;
        this.fastDelivery = fastDelivery;
        this.ratings = ratings;
    }
    public petsFoodEntity(Integer id, String name, Integer price, String image, Integer inStock, Boolean fastDelivery, Integer ratings) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.inStock = inStock;
        this.fastDelivery = fastDelivery;
        this.ratings = ratings;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Integer getprice() {
        return price;
    }

    public void price(Integer price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getinStock() {
        return inStock;
    }

    public void setinStock(Integer inStock) {
        this.inStock = inStock;
    }

    public Boolean getfastDelivery() {
        return fastDelivery;
    }

    public void setFastDelivery(Boolean fastDelivery) {
        this.fastDelivery = fastDelivery;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "petsFoodBean{" +
                "id=" + id +
                ", petfoodname='" + name + '\'' +
                ", petfoodprice=" +price +
                ", image='" + image + '\'' +
                ", instock=" + inStock +
                ", fastdelivery=" + fastDelivery +
                ", ratings=" + ratings +
                '}';
    }
}
