package mainOneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class mainOneToOne {
 
  public static void main(String[] args) {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
	EntityManager em=emf.createEntityManager();
	System.out.println(em);
	
}
}