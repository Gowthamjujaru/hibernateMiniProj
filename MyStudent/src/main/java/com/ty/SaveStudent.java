package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gowtham");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = new Student();
		student.setName("Madhu");
		student.setAge(22);
		student.setGender("Female");
		student.setPhno(9890897654l);
		student.setMarks(69);

		Student student1 = new Student();
		student1.setName("Santhosh");
		student1.setAge(23);
		student1.setGender("Male");
		student1.setPhno(9892397654l);
		student1.setMarks(96);

		Student student2 = new Student();
		student2.setName("Madhusudhan");
		student2.setAge(21);
		student2.setGender("Male");
		student2.setPhno(8234567890l);
		student2.setMarks(89);

		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityTransaction.commit();

		System.out.println("Data Saved Successfully");
	}

}
