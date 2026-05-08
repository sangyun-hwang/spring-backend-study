import java.util.ArrayList;
import java.util.List;

public class StudyLogManager {
    private final List<StudyLog> logs = new ArrayList<>();

    public void addLog(StudyLog log) {
        logs.add(log);
    }

    public void printAllLogs() {
        for (StudyLog log: logs) {
            log.printInfo();
            System.out.println();
        }
    }


    public void printLogsByCategory(StudyCategory category) {
        for (StudyLog log: logs) {
            if (log.getCategory().equals(category)) {
                log.printInfo();
                System.out.println();
            }
        }
    }



    public int getTotalMinutesByCategory(StudyCategory category) {
        int totalMinutes = 0;

        for (StudyLog log: logs) {
            if (log.getCategory().equals(category)) {
                totalMinutes += log.getMinutes();
            }
        }

        return totalMinutes;

    }

}
