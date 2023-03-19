package edu.tdtu;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Setter @Getter
public class Product {
    private Long id;
    private String name;
    private Double price;
    private String description;

    public Product(Product product)
    {
        this.name = product.name;
        this.id = product.id;
        this.price = product.price;
        this.description = product.description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}