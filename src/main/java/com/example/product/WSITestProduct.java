package com.example.product;

public class WSITestProduct {

   private String name;
   private int id;

    public WSITestProduct() {
    }

    public WSITestProduct(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "WSITestProduct{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
