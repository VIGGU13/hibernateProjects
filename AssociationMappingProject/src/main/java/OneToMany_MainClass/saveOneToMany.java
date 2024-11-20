package OneToMany_MainClass;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import oneToManyUniDirection.*;

public class saveOneToMany {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	et.begin();
	
	Deapartment dept=new Deapartment();
	dept.setName("Developer");
	dept.setLoc("Mangalore");
	
	Employees emps=new Employees();
	emps.setName("Vighnesh");
	emps.setDesig("Manager");
	
	Employees emp1=new Employees();
	emp1.setName("Shashank");
	emp1.setDesig("TL");
	
	Employees emp2=new Employees();
	emp2.setName("Divyansh");
	emp2.setDesig("TL");
	
	dept.setEmps(Arrays.asList(emps,emp1,emp2));
	 em.persist(dept);
	 et.commit();
	 System.out.println("Done");
}
}
