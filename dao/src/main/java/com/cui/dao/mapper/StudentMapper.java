package com.cui.dao.mapper;

import com.cui.fs.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cjs
 * Date： 2017/9/7.
 * Time： 9:50.
 */
@Mapper
public interface StudentMapper {
     List<Student> getStudentList(Student student);
     int addStudent(Student st);
     int getTeacherId(Student st);
     int delStudent(Integer id);
     int updateStudent(Student st);
}
