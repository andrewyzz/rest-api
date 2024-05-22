package ro.andrew.restapi;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService{
    ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public String createProduct(Product product) {
        productRepository.save(product);
        return "Done";
    }

    @Override
    public String updateProduct(Product product) {
        productRepository.save(product);
        return "Done";
    }

    @Override
    public String deleteProduct(Long productId) {
        productRepository.deleteById(productId);
        return "Done";
    }

    @Override
    public Product getProduct(Long productId) {
        return productRepository.findById(productId).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
