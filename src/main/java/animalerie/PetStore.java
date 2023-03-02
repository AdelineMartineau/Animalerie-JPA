package animalerie;
import jakarta.persistence.*;

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
