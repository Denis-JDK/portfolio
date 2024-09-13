package my.project.portfolio.service;

import lombok.AllArgsConstructor;
import my.project.portfolio.entity.Product;
import my.project.portfolio.repository.ShopRepositoryProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceShop {


        private ShopRepositoryProduct shopRepositoryProduct;


    public List<Product> findAll() {
            return shopRepositoryProduct.findAll();
        }



    }
