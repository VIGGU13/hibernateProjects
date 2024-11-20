package OneToMany_MainClass;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;
import oneToManyUniDirection.Deapartment;

public class findByName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String dname=sc.nextLine();
		int id=sc.nextInt();

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select d.emps from Deapartment d where d.id=?1");
		q.setParameter(1, id);
		
		List<Deapartment> dt=q.getResultList();
		if(dt.size()>0) {
			System.out.println(dt);
		}else {
			System.out.println("Department not found");
		}
}
}