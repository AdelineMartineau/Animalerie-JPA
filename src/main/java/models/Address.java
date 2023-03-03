package models;
import jakarta.persistence.*;

@Entity(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 6)
    private Integer number;
    @Column(length = 100)
    private String street;
    @Column(length = 150)
    private String zipcode;
    @Column(length = 150)
    private String city;

    public Address() {
    }
    public Address(Integer number, String street, String zipcode, String city ) {
        this.number = number;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adresse{" + "numero='" + number + '\'' + ", rue='" + street + '\'' + ", code postal='" + zipcode + '\'' + ", ville='" + city +'}';
    }
}
