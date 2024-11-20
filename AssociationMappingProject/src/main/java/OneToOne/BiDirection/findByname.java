package OneToOne.BiDirection;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class findByname {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
		EntityManager em=emf.createEntityManager();
		//Query q=em.createQuery("select p from personEnt p where p.name=?1");
		Query q=em.createQuery("select p.card.adharNo from personEnt p where p.name=?1");
		q.setParameter(1, name);
		List per=q.getResultList();
		if(per.size()!=0) {
		
		per.forEach(person->System.out.println(person));
		}else {
			System.out.println("Person not found");
		}
	}
}
