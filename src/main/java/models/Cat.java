package models;
import jakarta.persistence.*;
import java.util.Date;

@Entity(name="cat")
public class Cat extends Animal {
    @Column(length = 6)
    private String chipId;
    public Cat() {}
    public Cat(Date birthDate, String color, PetStore petstore, String chipId) {
        super(birthDate, color, petstore);
        this.chipId = chipId;
    }
    public Cat(String chipId) {
        this.chipId = chipId;
    }
    public String getChipId() {
        return chipId;
    }
    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
