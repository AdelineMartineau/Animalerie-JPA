package org.example;
import animalerie.Animal;
import animalerie.PetStore;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class TestJPA {
        public static void main(String[] args){
                EntityManagerFactory emf = Persistence.createEntityManagerFactory( "animalerie-jpa");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();

                //Extraire tout les animaux d'un petstore
                PetStore petStore = em.find(PetStore.class, 1);
                if (petStore != null) {
                        for (Animal item : petStore.getAnimals()) {
                                System.out.println(item);
                        };
                }
        }
}
