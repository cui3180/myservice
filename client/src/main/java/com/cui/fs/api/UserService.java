package com.cui.fs.api;

import com.cui.fs.model.User;

/**dao
 * Created by cjs
 * Date： 2017/7/12.
 * Time： 15:05.
 */
public interface UserService {
    /**
     * 获取用户
     */
    User getUser(Long id);
     int addUser(User us);
    User getUserByName(String name);
}
