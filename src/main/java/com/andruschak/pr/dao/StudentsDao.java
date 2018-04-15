package com.andruschak.pr.dao;

import com.andruschak.pr.entities.Student;

public interface StudentsDao {
    public void addStudent(Student student);
    public Student getStudentById(int id);
}