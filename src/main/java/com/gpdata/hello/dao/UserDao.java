package com.gpdata.hello.dao;

import com.gpdata.hello.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by acer_liuyutong on 2017/5/10.
 */
public interface UserDao extends JpaRepository<User,Long>{

//    User findByName(String name);
//    User findByNameAndAge(String name, Integer age);
}
