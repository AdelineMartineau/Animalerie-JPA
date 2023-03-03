package animalerie;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 6)
    private LocalDate birth;
    @Column(length = 100)
    private String color;

    public Animal() {
    }
    public Animal(LocalDate birth, String color ) {
        this.birth = birth;
        this.color = color;
    }

    @ManyToOne
    @JoinColumn(name="IDPETSTORE")
    private PetStore petstore;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "birth='" + birth + '\'' + ", color='" + color +'}';
    }
}
