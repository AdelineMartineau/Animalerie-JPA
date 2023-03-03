package models;
import jakarta.persistence.*;
import java.util.List;

@Entity(name = "petstore")
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 6)
    private String name;
    @Column(length = 100)
    private String managerName;

    public PetStore() {}
    public PetStore(String name, String managerName, List<Product> products, Address address ) {
        this.name = name;
        this.managerName = managerName;
        this.products = products;
        this.address = address;

    }
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @ManyToMany
    @JoinTable(name="petstorproduct",
            joinColumns= @JoinColumn(name="idpetstore"),
            inverseJoinColumns= @JoinColumn(name="idproduct")
    )
    private List<Product> products;
    @OneToMany(mappedBy="petstore")
    private List<Animal> animals;
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return this.products;
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    public void setAnimals( List<Animal> clients ) {
        this.animals = animals;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "PetStore{" + "name='" + name + '\'' + ", managerName='" + managerName +'}';
    }
}
