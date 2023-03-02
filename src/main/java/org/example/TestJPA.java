package org.example;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestJPA {
        public static void main(String[] args){
                EntityManagerFactory emf = Persistence.createEntityManagerFactory( "animalerie-jpa");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();
        }
}
