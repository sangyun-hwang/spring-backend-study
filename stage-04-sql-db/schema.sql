CREATE TABLE IF NOT EXISTS study_logs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    minutes INT NOT NULL,
    memo VARCHAR(255),
    user_id BIGINT NOT NULL,
    CONSTRAINT fk_study_logs_user FOREIGN KEY (user_id) REFERENCES users(id)
);
