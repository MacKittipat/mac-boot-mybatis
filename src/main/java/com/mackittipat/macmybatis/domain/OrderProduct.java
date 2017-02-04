package com.mackittipat.macmybatis.domain;

public class OrderProduct {

    private Long id;
    private String productName;
    private Double productPrice;
    private String customerName;
    private Product product;
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", customerName='" + customerName + '\'' +
                ", product=" + product +
                ", customer=" + customer +
                '}';
    }
}
