package com.telcomate.TelcoMate.Model.Entity;

public class Product {
    int productId;
    String productName;
    Double productPrice;
    Double GSTPerc;

    public Product() {

    }
    public Product(int productId,String productName,Double productPrice,Double GSTPerc){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
        this.GSTPerc=GSTPerc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", GSTPerc=" + GSTPerc +
                '}';
    }

    public int getProductId(){
        return this.productId;
    }
    public String getProductName(){
        return this.productName;
    }

    public Double getProductPrice(){
        return this.productPrice;
    }

    public Double getGSTPerc(){
        return this.GSTPerc;
    }

   public void setProductName(String productName){
        this.productName=productName;
   }

    public void setProductPrice(Double productPrice){
        this.productPrice=productPrice;
    }

    public void setGSTPerc(Double GSTPerc){
        this.GSTPerc=GSTPerc;
    }

}


