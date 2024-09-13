package my.project.portfolio.repository;


import my.project.portfolio.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ShopRepositoryProduct extends JpaRepository<Product,Long>{

}
