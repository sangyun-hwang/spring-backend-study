import java.util.ArrayList;
import java.util.List;

public class StudyLogManager {
    private final List<StudyLog> logs = new ArrayList<>();

    public void addLog(StudyLog log) {
        logs.add(log);
    }

    public List<StudyLog> getAllLogs() {
        return logs;
    }

    public List<StudyLog> getLogsByCategory(StudyCategory category) {
        List<StudyLog> logsByCategory = new ArrayList<>();

        for (StudyLog log : logs) {
            if (log.getCategory().equals(category)) {
                logsByCategory.add(log);
            }
        }

        return logsByCategory;
    }

    public int getTotalMinutesByCategory(StudyCategory category) {
        int totalMinutes = 0;

        for (StudyLog log : logs) {
            if (log.getCategory().equals(category)) {
                totalMinutes += log.getMinutes();
            }
        }

        return totalMinutes;
    }
}
