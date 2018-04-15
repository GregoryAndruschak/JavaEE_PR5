package com.andruschak.pr.worker;

import org.springframework.beans.factory.annotation.Autowired;

import com.andruschak.pr.*;
import com.andruschak.pr.dao.*;
import com.andruschak.pr.entities.Student;

public class WorkWithStudents {
    @Autowired
    private StudentsDao studentsDao;

    public void saveStudentToDb(Student student) {
        if ((student != null) && (student.getPib() != null) && (!"".equals(student.getPib()))
                && (student.getCourse() > 0)) {
            studentsDao.addStudent(student);
            System.out.println("Student have been saved " + student);
        }
    }

    public Student getStudentFromDb(int id) {
        Student s = studentsDao.getStudentById(id);
        System.out.println(s.getStudentId()+" "+s.getPib()+" "+s.getCourse());
        return s;

    }



}