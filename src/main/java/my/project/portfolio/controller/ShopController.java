package my.project.portfolio.controller;

import lombok.AllArgsConstructor;
import my.project.portfolio.entity.Product;
import my.project.portfolio.service.ServiceShop;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/shop")
public class ShopController {

  private ServiceShop serviceShop;

    @GetMapping
    public ResponseEntity<List<Product>> findAllProduct () {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(serviceShop.findAll());
    }

    @GetMapping("/{id}")
    public Product finById (@PathVariable Long id) {
        return serviceShop.findById(id);
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) { //@RequestBody указывает что обьект firstDto находится в теле запроса, конвертирует из json в java обьект
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceShop.create(product)); //ResponseEntity.status(HttpStatus.CREATED) сделали костомный код ответа не просто 200, а 201 CREATE
    }

}
