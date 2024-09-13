package my.project.portfolio.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Data
@Table(name = "brand", schema = "shop")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "brandId")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<Product> products;
}
