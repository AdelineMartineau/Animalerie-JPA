package models;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "animal")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 6)
    private Date birthDate;
    @Column(length = 100)
    private String color;

    public Animal() {
    }
    public Animal(Date birthDate, String color, PetStore petstore ) {
        this.birthDate = birthDate;
        this.color = color;
        this.petstore = petstore;
    }
    @ManyToOne(optional = false)
    private PetStore petstore;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public PetStore getPetStore() {
        return petstore;
    }
    public void setPetStore(PetStore petStore) {
        this.petstore = petStore;
    }
    @Override
    public String toString() {
        return "Animal{" + "Date naissance='" + birthDate + '\'' + ", color='" + color + '\'' + "Petstore='" + petstore +'}';
    }
}
