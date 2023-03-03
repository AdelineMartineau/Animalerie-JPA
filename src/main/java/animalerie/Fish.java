package animalerie;
import jakarta.persistence.*;

@Entity
public class Fish extends Animal {
    @Column(length = 6)
    @Enumerated(EnumType.STRING)
    private FishLivEnv fishLivEnv;

    public Fish() {
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
        return "Animal{" + "fishLivEnv='" + fishLivEnv + '}';
    }
}
