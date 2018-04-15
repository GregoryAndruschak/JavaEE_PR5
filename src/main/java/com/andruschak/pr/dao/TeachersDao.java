package com.andruschak.pr.dao;

import com.andruschak.pr.entities.Teacher;

public interface TeachersDao {

    void addTeacher(Teacher teacher);

    Teacher getTeacherById(int id);

    void saveTacher(Teacher teacher);
}