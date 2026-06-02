package com.study.stage03.mapper;

import com.study.stage03.domain.AppUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    AppUser findByUsername(@Param("username") String username);
}