package ro.andrew.restapi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private Long productId;
    private String name;
    private Integer price;
    private Integer quantity;
    private Boolean available;
    private Status product_status;
    enum Status {
        IN_STOCK,
        OUT_OF_STOCK,
        DISCONTINUED
    }
    public Product(){
    }
    public Product(Long productId,String name, Integer price, Integer quantity, Boolean available, Status product_status) {
        this.productId=productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.available = available;
        this.product_status = product_status;
    }
    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Boolean getAvailable() {
        return available;
    }

    public Status getProduct_status() {
        return product_status;
    }
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void setProduct_status(Status product_status) {
        this.product_status = product_status;
    }
}