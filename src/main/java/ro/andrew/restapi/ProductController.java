package ro.andrew.restapi;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/product")
public class ProductController {
    ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("{productId}")
    public Product GetProductDetails(@PathVariable("productId") Long productId){
        return productService.getProduct(productId);
    }
    @GetMapping()
    public List<Product> GetAllProductDetails(){
        return productService.getAllProducts();
    }
    @PostMapping
    public String createProduct(@RequestBody Product product){
        productService.createProduct(product);
        return "Product succesfully created.";
    }
    @PutMapping
    public String updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
        return "Product succesfully updated.";
    }
    @DeleteMapping("{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId){
        productService.deleteProduct(productId);
        return "Product succesfully deleted.";
    }
}