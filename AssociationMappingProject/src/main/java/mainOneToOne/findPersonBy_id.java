package mainOneToOne;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOneMapping.UniDir.Person;



public class findPersonBy_id {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id!!!");
	int id=sc.nextInt();
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	et.begin();
	
	Person p=em.find(Person.class,id);
	if(p!=null) {
		System.out.print(p);
	}else {
		System.err.print("Id Not Found!!please check once");
	}
}
}
