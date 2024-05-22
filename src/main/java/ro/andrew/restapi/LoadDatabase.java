package ro.andrew.restapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDb(ProductRepository repository){
        return args -> {
            log.info("Preloading " + repository.save(new Product(1L, "Laptop", 1000, 1, true, Product.Status.IN_STOCK)));
            log.info("Preloading " + repository.save(new Product(2L, "Laptop", 1000, 1, true, Product.Status.IN_STOCK)));
        };
    }
}
