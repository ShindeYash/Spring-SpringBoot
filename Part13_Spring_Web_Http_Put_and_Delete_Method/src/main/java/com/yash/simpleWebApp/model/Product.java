package com.yash.simpleWebApp.model;


public class Product {
    private int prodID;
    private int price;
    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodID=" + prodID +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }


    public Product(int prodID, String Name, int Price){
        this.prodID = prodID;
        this.name = Name;
        this.price = Price;
    }

    public Product(){

    }


}
