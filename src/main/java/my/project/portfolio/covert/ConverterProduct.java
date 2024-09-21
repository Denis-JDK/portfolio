package my.project.portfolio.covert;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import my.project.portfolio.dto.ProductDto;
import my.project.portfolio.entity.Product;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConverterProduct {

    public static Product productDtoToProduct(ProductDto dto) {
        return new Product(dto.getId(), dto.getBrandId(), dto.getProductTypeId(), dto.getCategoryId(), dto.getPrice());
    }

    public static ProductDto productToProductDto(Product product) {
        return new ProductDto(product.getId(), product.getBrandId(), product.getProductTypeId(), product.getCategoryId(), product.getPrice());
    }
}
