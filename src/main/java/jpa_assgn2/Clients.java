package jpa_assgn2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Clients {
	
	public static void main(String[] args) {
		
		 System.out.println("start");
		 
		 EntityManagerFactory emf= Persistence.createEntityManagerFactory("abcd");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction tr= em.getTransaction();
		 
		 tr.begin();
		  Author obj= new Author(101, "Sonu", "Tonu");
			em.persist(obj);
		 Author obj2= new Author(109, "Ponu","Lonu");
			em.persist(obj2);
				
				obj2.setFirstName("yes");
				em.merge(obj2);
				
			tr.commit();

			 
			 System.out.println("end");

}
	}
//table
//Create table Author(authorId int(5),firstName varchar(15),LastName varchar(15));