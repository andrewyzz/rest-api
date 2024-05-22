package ro.andrew.restapi;

import java.util.List;

public interface ProductService {
    public String createProduct(Product product);
    public String updateProduct(Product product);
    public String deleteProduct(Long productId);
    public Product getProduct(Long productId);
    public List<Product> getAllProducts();
}
