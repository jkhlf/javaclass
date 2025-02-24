package org.classes;

public class Produto {

    String name;
    double price;  
    Promotion promotion;

    Produto(String name, double price, Promotion promotion){
        this.name = name;
        this.price = price;
        this.promotion = promotion;
    }

    void showInformation() {
        System.out.println("Produto: " + name);
        System.out.println("Preço original: " + price);
        System.out.println("Status: " + promotion.getDesconto()); 

        double newPrice = price - (price * promotion.getDescontoPer());  
        System.out.println("Preço com desconto: " + newPrice);
    }
}
