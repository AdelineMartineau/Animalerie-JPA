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
    private LocalDate birthDate;
    @Column(length = 100)
    private String color;

    public Animal() {
    }
    public Animal(LocalDate birth, String color ) {
        this.birthDate = birth;
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
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Animal{" + "Date naissance='" + birthDate + '\'' + ", color='" + color +'}';
    }
}
