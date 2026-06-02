package com.study.stage03.domain;

public class AppUser {
    private final Long id;
    private final String username;
    private final String password;
    private final String role;
    private final boolean enabled;


    public AppUser(Long id, String username, String password, String role, boolean enabled) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("username must not be blank");
        }

        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("password must not be blank");
        }

        if (role == null || role.isBlank()) {
            throw new IllegalArgumentException("role must not be blank");
        }

        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
    }

    public Long getId() { return id; }

    public String getUsername() { return username; }

    public String getPassword() { return password; }

    public String getRole() { return role; }

    public boolean isEnabled() { return enabled; }
}
