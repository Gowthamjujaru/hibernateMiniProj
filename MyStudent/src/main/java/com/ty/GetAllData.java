package com.ty;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;


public class GetAllData {
	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("gowtham");
		EntityManager entityManager=entitymanagerfactory.createEntityManager();
		//Query query = entityManager.createQuery("select s from Student s");
		Query query = entityManager.createQuery("select s from Student s where s.marks=?1 or s.age=?2");
		query.setParameter(1, 99.0);
		query.setParameter(2,22);
		List<Student> students = query.getResultList();
		
		for(Student student : students) {
			System.out.println("the stuent id is: "+student.getId());
			System.out.println("the student name is: "+student.getName());
			System.out.println("the student age is: "+student.getAge());
			System.out.println("the student geneder is: "+student.getGender());
			System.out.println("the student phno is: "+student.getPhno());
			System.out.println("the student marks are : "+student.getMarks());
			System.out.println("************************************");
			
		}
		System.out.println("data Saved!!");
	}

}
