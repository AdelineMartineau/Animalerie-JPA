package models;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name="fish")
public class Fish extends Animal {
    @Column(length = 6)
    @Enumerated(EnumType.STRING)
    private FishLivEnv fishLivEnv;
    public Fish() {}

    public Fish(Date birthDate, String color, PetStore petStore, FishLivEnv fishLivEnv) {
        super(birthDate, color, petStore);
        this.fishLivEnv = fishLivEnv;
    }
    public Fish(FishLivEnv fishLivEnv) {
        this.fishLivEnv = fishLivEnv;
    }
    public FishLivEnv getFishLivEnv() {
        return fishLivEnv;
    }
    public void setFishLivEnv(FishLivEnv fishLivEnv) {
        this.fishLivEnv = fishLivEnv;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
