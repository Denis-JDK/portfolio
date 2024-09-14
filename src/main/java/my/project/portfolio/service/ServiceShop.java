package my.project.portfolio.service;

import lombok.AllArgsConstructor;
import my.project.portfolio.entity.Product;
import my.project.portfolio.repository.ShopRepositoryProduct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceShop {


        private ShopRepositoryProduct shopRepositoryProduct;


    public List<Product> findAll() {
            return shopRepositoryProduct.findAll();
        }


    public Product findById(Long id) {
        return shopRepositoryProduct.findById(id).stream().findFirst().orElseThrow();
    }

    public Product create(Product product) {
       return shopRepositoryProduct.save(product);
    }
}
