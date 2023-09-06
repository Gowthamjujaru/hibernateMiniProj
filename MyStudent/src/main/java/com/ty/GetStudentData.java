package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetStudentData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gowtham");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//no need of transaction
		Student student = entityManager.find(Student.class, 3);
		System.out.println("Student Id is "+student.getId());
		System.out.println("Student Name is "+student.getName());
		System.out.println("Student Age is "+student.getAge());
		System.out.println("Student Gender is "+student.getGender());
		System.out.println("Student Phno is "+student.getPhno());
		System.out.println("Student Marks is "+student.getMarks());
	}

}
