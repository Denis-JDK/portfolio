package my.project.portfolio.entity.filter;


import my.project.portfolio.entity.Product;
import my.project.portfolio.entity.specifications.ProductSpecifications;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Map;

public class ProductFilter {
    private Specification<Product> specification;


    public ProductFilter(Map<String,String> map) {
        this.specification = Specification.where(null);

        var minPrice = map.get("minPrice");
        var maxPrice = map.get("maxPrice");
        var name = map.get("name");

        if (!minPrice.isEmpty()) {
            var minPriceBigDecimal = new BigDecimal(minPrice);
            specification = specification.and(ProductSpecifications.priceGreaterOrEqualsThen(minPriceBigDecimal));
        }
        if (!maxPrice.isEmpty()) {
            var maxBigDecimal = new BigDecimal(maxPrice);
            specification = specification.and(ProductSpecifications.priceLessOrEqualsThen(maxBigDecimal));
        }
        if (!name.isEmpty()) {
            var nameString = new String(name);
            specification = specification.and(ProductSpecifications.nameLikeThen(name));
        }
    }
}
