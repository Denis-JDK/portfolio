package my.project.portfolio.controller;

import lombok.AllArgsConstructor;
import my.project.portfolio.entity.Product;
import my.project.portfolio.service.ServiceShop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/shop")
public class ShopController {

  private ServiceShop serviceShop;

    @GetMapping
    public List<Product> findAllProduct () {
        return serviceShop.findAll();
    }

}
