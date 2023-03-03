package models;
import jakarta.persistence.*;
import java.util.List;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 6)
    private String code;
    @Column(length = 100)
    private String label;
    @Column(length = 100)
    @Enumerated(EnumType.STRING)
    private ProductType prodtype;
    @Column(length = 100)
    private Double price;

    public Product() {
    }
    public Product(String code, String label, ProductType prodtype, Double price) {
        this.code = code;
        this.label = label;
        this.prodtype = prodtype;
        this.price = price;
    }
    @ManyToMany(mappedBy="products")
    private List<PetStore> petstores;
    public void setPetstores(List<PetStore> petstores) {
        this.petstores = petstores;
    }
    public List<PetStore> getPetstores() {
        return this.petstores;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public ProductType getProdtype() {
        return prodtype;
    }
    public void setProdtype(ProductType prodtype) {
        this.prodtype = prodtype;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" + "code='" + code + '\'' + ", label='" + label + ", prodtype='" + prodtype + ", price='" + price + '}';
    }
}
