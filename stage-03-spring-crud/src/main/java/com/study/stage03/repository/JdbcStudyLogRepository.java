package com.study.stage03.repository;

import com.study.stage03.domain.StudyCategory;
import com.study.stage03.domain.StudyLog;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class JdbcStudyLogRepository {
    private final DataSource dataSource;


    public JdbcStudyLogRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<StudyLog> findAll() {
        String sql = "SELECT id, title, category, minutes, memo FROM study_logs";

        List<StudyLog> logs = new ArrayList<>();

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()
        ) {
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String title = resultSet.getString("title");
                StudyCategory category = StudyCategory.valueOf(resultSet.getString("category"));
                int minutes = resultSet.getInt("minutes");
                String memo = resultSet.getString("memo");

                logs.add(new StudyLog(id, title, category, minutes, memo));
            }

            return logs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<StudyLog> findByCategory(StudyCategory category) {
        String sql = "SELECT id, title, category, minutes, memo FROM study_logs WHERE category = ?";
        List<StudyLog> logs = new ArrayList<>();

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, category.name());
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Long id = resultSet.getLong("id");
                    String title = resultSet.getString("title");
                    StudyCategory getCategory = StudyCategory.valueOf(resultSet.getString("category"));
                    int minutes = resultSet.getInt("minutes");
                    String memo = resultSet.getString("memo");

                    logs.add(new StudyLog(id, title, getCategory, minutes, memo));
                }
            }

            return logs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public StudyLog findById(Long id) {
        String sql = "SELECT id, title, category, minutes, memo FROM study_logs WHERE id = ?";

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setLong(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Long studyLogId = resultSet.getLong("id");
                    String title = resultSet.getString("title");
                    StudyCategory category = StudyCategory.valueOf(resultSet.getString("category"));
                    int minutes = resultSet.getInt("minutes");
                    String memo = resultSet.getString("memo");

                    return new StudyLog(studyLogId, title, category, minutes, memo);
                }

                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
