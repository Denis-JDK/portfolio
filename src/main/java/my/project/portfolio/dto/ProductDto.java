package my.project.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import my.project.portfolio.entity.Brand;
import my.project.portfolio.entity.Category;
import my.project.portfolio.entity.ProductType;
import java.math.BigDecimal;
    @Data
    @Builder
    @AllArgsConstructor
    @RequiredArgsConstructor
    public class ProductDto {
        private Long id;
        private Brand brandId;
        private ProductType productTypeId;
        private Category categoryId;
        private BigDecimal price;
    }
