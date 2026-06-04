CREATE DATABASE IF NOT EXISTS spring_backend_study;
USE spring_backend_study;

CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE TABLE IF NOT EXISTS study_logs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    minutes INT NOT NULL,
    memo VARCHAR(255),
    user_id BIGINT NOT NULL,
    CONSTRAINT fk_study_logs_user FOREIGN KEY (user_id) REFERENCES users(id)
);
