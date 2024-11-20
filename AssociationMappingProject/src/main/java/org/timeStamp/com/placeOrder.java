package org.timeStamp.com;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class placeOrder {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	et.begin();
	
	foodOrder fd=new foodOrder();
	fd.setFood_item("Palav");
	fd.setCost(1234);
	
	LocalDateTime now=LocalDateTime.now();
	LocalDateTime deliverytime=now.plusMinutes(20);
		fd.setDeliverytime(deliverytime);
		em.persist(fd);
		et.commit();
		System.out.println("Done with timeStamp");
	
}

}
