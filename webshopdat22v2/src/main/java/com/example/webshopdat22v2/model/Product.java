package com.example.webshopdat22v2.model;

public class Product {

    private int id;
    private String name;
    private int price;

    public Product(){

    }
    public Product(int id, String name, int price){

    }


    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return id + ", " + name + ", " + price;
    }
}
