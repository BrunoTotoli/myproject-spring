package br.com.bruno.config;

import br.com.bruno.model.entities.Product;
import br.com.bruno.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TestConfig implements CommandLineRunner {

    ProductRepository productRepository;

    public TestConfig(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Product> list = list = List.of(
                new Product(null, "Ifodase", "ifodase melhor tecnlogia", 10000D, "aaaaa"),
                new Product(null, "Churrasqueira Eletrica", "toste todos seus alimentos", 2000D, "aaaaaaaa"),
                new Product(null, "Forno", "cozinhe todos seus alimentos", 1000D, "bbbbbbbbbbb"),
                new Product(null, "Airfrai", "airfraier", 500D, "eeeeeeeeeeeeeeeeee"));
        productRepository.saveAll(list);
    }
}

