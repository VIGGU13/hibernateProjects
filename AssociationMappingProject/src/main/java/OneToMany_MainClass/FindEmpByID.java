package OneToMany_MainClass;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import oneToManyUniDirection.Employees;

public class FindEmpByID {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
	   Employees emp=em.find(Employees.class,id);
	   if(emp!=null) {
		   System.out.println(emp);
	   }else {
		   System.out.println("Id Not Found");
	   }
}
}