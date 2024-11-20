package mainOneToOne;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import OneToOneMapping.UniDir.Person;

public class findPersonByName {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name!!!");
	String name=sc.nextLine();
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
	EntityManager em=emf.createEntityManager();
//	EntityTransaction et=em.getTransaction();
//	et.begin();
//	
	Query q=em.createQuery("select p from Person p where p.name=?1");
	q.setParameter(1, name);
	
	List lm=q.getResultList();
	if(lm.size()>0) {
		lm.forEach(val->System.out.println(val));
	}else {
		System.out.print("Person not found!!!!");
	}
}
}
