package animalerie;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 6)
    private String name;
    @Column(length = 100)
    private String managerName;

    public PetStore() {
    }
    public PetStore(String name, String managerName ) {
        this.name = name;
        this.managerName = managerName;
    }

    @OneToOne
    private Address address;
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @ManyToMany
    @JoinTable(name="PETSTORPRODUCT",
            joinColumns= @JoinColumn(name="IDPETSTORE", referencedColumnName="ID"),
            inverseJoinColumns= @JoinColumn(name="IDPRODUCT", referencedColumnName="ID")
    )
    private List<Product> products;
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return this.products;
    }

    @OneToMany(mappedBy="petstore")
    private List<Animal> animals;
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
