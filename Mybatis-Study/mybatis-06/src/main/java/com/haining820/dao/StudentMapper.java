package com.haining820.dao;

import com.haining820.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //查询学生以及对应的老师信息
    public List<Student> getStudent();
    public List<Student> getStudent2();

}
