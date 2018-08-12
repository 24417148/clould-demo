package com.zyl.user.repository;

import com.zyl.user.repository.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserDao {

  User getUser(@Param("id") String id);

}
