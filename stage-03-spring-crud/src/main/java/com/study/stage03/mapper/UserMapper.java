package com.study.stage03.mapper;

import com.study.stage03.domain.AppUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    AppUser findByUsername(@Param("username") String username);

    int save(
            @Param("username") String username,
            @Param("password") String password,
            @Param("role") String role,
            @Param("enabled") boolean enabled
    );
}