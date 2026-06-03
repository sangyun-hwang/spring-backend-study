package com.study.stage03.service;

import com.study.stage03.domain.AppUser;
import com.study.stage03.dto.SignupRequest;
import com.study.stage03.mapper.UserMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignupService {
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public SignupService(UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean isUsernameDuplicated(String username) {
        AppUser existingUser = userMapper.findByUsername(username);
        return existingUser != null;
    }

    public void signup(SignupRequest request) {
        String encodedPassword = passwordEncoder.encode(request.getPassword());

        userMapper.save(
                request.getUsername(),
                encodedPassword,
                "ROLE_USER",
                true
        );
    }
}
