package OneToOne.BiDirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class findById {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
		EntityManager em=emf.createEntityManager();
		Person p1=em.find(Person.class, 2);
		if(p1!=null) {
			System.out.println(p1);
		}else {
			System.out.println("Person not found");
		}
	}
}
