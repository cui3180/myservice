package com.cui.dao.mapper;

import com.cui.fs.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by cjs
 * Date： 2017/7/12.
 * Time： 14:56.
 */
@Mapper
public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    Integer insert(User user);

    void update(User user);

    void delete(Long id);

    User getUserByName(User user);
}
