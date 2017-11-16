package com.cui.dao.mapper;

import com.cui.fs.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cjs
 * Date： 2017/9/7.
 * Time： 9:47.
 */
@Mapper
public interface TeacherMapper {
     List<Teacher> getTeachList();
     int addTeacher(Teacher te);
     int updateTeacher(Teacher te);
     Teacher getTeachOne(Long id);

}
