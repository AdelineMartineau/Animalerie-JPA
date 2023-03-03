package org.example;
import models.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
        public static void main(String[] args){
                EntityManagerFactory emf = Persistence.createEntityManagerFactory( "animalerie-jpa");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();

                Address address = new Address(10, "Rue des sabliers", "44200", "Nantes");
                em.persist(address);
                Address address2 = new Address(9, "Boulevard Napoleon", "46000", "Lyon");
                em.persist(address2);
                Address address3 = new Address(63, "Rue des fleurs", "34000", "Montpellier");
                em.persist(address3);

                Product product1 = new Product("ABCD1234", "shower gel", ProductType.cleaning, 5.0);
                em.persist(product1);
                Product product2 = new Product("EFGH5678", "kibble", ProductType.food, 35.3);
                em.persist(product2);
                Product product3 = new Product("IJKL9126", "ball", ProductType.accessory, 5.0);
                em.persist(product3);

                List<Product> productList = new ArrayList<>();
                productList.add(product1);
                productList.add(product2);
                productList.add(product3);

                PetStore petStore = new PetStore("Animalins", "Harry King", productList, address);
                em.persist(petStore);
                PetStore petStore2 = new PetStore("Arche de Noe", "Mattie Cooke", productList, address2);
                em.persist(petStore2);
                PetStore petStore3 = new PetStore("Pet store", "John Doe", productList, address3);
                em.persist(petStore3);

                Fish fish1 = new Fish(new Date(2023, 10, 12), "bleu", petStore, FishLivEnv.fresh_water);
                em.persist(fish1);
                Fish fish2 = new Fish(new Date(2022, 11, 12), "vert", petStore2,  FishLivEnv.sea_water);
                em.persist(fish2);
                Fish fish3 = new Fish(new Date(2023, 3, 2), "rouge", petStore3, FishLivEnv.fresh_water);
                em.persist(fish3);

                Cat cat1 = new Cat(new Date(2023, 3, 2), "blanc", petStore, "UHJI1546");
                em.persist(cat1);
                Cat cat2 = new Cat(new Date(2022, 6, 20), "noir", petStore2, "IOPM5699");
                em.persist(cat2);
                Cat cat3 = new Cat(new Date(2021, 9, 3), "roux", petStore3, "AZER1444");
                em.persist(cat3);

                em.getTransaction().commit();

                TypedQuery<Animal> findAllQUery = em.createQuery("from animal where petstore='2'", Animal.class);
                System.out.println(findAllQUery.getResultList());

                em.close();
                emf.close();
        }
}
