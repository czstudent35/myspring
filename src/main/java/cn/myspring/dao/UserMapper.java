package cn.myspring.dao;

import cn.myspring.po.User;
import java.util.*;

/**
 * Created by user on 2017/12/12.
 */
public interface UserMapper {
    public List<User> findUserById() throws Exception;
    public List<User> findUserByName(String username) throws Exception;
}
