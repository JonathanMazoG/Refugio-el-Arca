package com.mycompany.zoo.el.arca;
public class Suministro {
    private String name;
    private String dateOfPurchase;
    private float price;
    public Suministro(String name, String dateOfPurchase, float price) {
        this.name = name;
        this.dateOfPurchase = dateOfPurchase;
        this.price = price;
    }
    public Suministro() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateOfPurchase() {
        return dateOfPurchase;
    }
    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Suministro [name=" + name + ", dateOfPurchase=" + dateOfPurchase + ", price=" + price + "]";
    }

    
}
