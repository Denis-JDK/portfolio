package my.project.portfolio.service;

import lombok.AllArgsConstructor;
import my.project.portfolio.covert.ConverterProduct;
import my.project.portfolio.dto.ProductDto;
import my.project.portfolio.entity.Product;
import my.project.portfolio.repository.ShopRepositoryProduct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class ServiceShop {


        private ShopRepositoryProduct shopRepositoryProduct;


    public List<ProductDto> findAll() {
            return shopRepositoryProduct.findAll().stream().map(ConverterProduct::productToProductDto).collect(Collectors.toList());
        }


    public ProductDto findById(Long id) {
       return ConverterProduct.productToProductDto(shopRepositoryProduct.findById(id).stream().findFirst().orElseThrow());
    }

    public ProductDto create(ProductDto dto) {
        return ConverterProduct.productToProductDto(shopRepositoryProduct.save(ConverterProduct.productDtoToProduct(dto)));

    }

}
