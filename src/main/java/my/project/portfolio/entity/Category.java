package my.project.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Data
@Table(name = "category", schema = "shop")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "categoryId")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<Product> products;
}
