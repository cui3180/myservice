package com.cui.fs.api;

import com.cui.fs.model.Student;
import com.cui.fs.util.BaseResponseVo;
import com.cui.fs.util.query.QueryStudent;

import java.util.List;

/**
 * Created by cjs
 * Date： 2017/9/18.
 * Time： 15:39.
 */
public interface StudentService {
    BaseResponseVo<List<Student>> getStudentList(Student queryStudent);

    BaseResponseVo addStudent(Student student);

    BaseResponseVo delStudent(QueryStudent queryStudent);

    BaseResponseVo modStudent(Student student);


}
