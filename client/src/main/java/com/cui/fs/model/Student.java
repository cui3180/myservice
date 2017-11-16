package com.cui.fs.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by cjs
 * Date： 2017/9/7.
 * Time： 9:43.
 */
@Data
public class Student {
    private Long id;
    private Long teacherId;
    private String studentName;
    private String studentClass;
    private String studentPhone;
    private Date  updateTime;
    private Date  creatTime;
    private String teacherName;

}
