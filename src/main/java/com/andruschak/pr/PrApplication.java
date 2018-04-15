package com.andruschak.pr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;

import com.andruschak.pr.entities.Student;
import com.andruschak.pr.entities.Teacher;
import com.andruschak.pr.worker.*;


public class PrApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		Student testStudent = new Student("Vlad Valt", 5);
		WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");
		// new WorkWithStudents();
		// worker.saveStudentToDb(testStudent);
		// worker.getStudentFromDb(1);

		WorkWithTeacher workWithTeacher = (WorkWithTeacher) context.getBean("teachersWorker");
		Teacher teacher = new Teacher();
		teacher.setFirstname("Andrii");
		teacher.setLastname("Glybovets");
		teacher.setCellphone("+380675097865");
		teacher = workWithTeacher.addTeacher(teacher);
		teacher.setBirthDate(new Date(0, 0, 0));
		workWithTeacher.saveTacher(teacher);
	}
}
