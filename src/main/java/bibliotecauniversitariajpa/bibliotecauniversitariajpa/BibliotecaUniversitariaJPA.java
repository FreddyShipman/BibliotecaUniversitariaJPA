package bibliotecauniversitariajpa.bibliotecauniversitariajpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author alfre
 */
public class BibliotecaUniversitariaJPA {

    public static void main(String[] args) {
        System.out.println("Todo funciona");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaUniversitariaPU");
        EntityManager em = emf.createEntityManager();
    }
}
