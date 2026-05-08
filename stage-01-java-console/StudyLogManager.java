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

//    public void printJavaLogs() {
//        for (StudyLog log: logs) {
//            if (log.getCategory().equals("JAVA")) {
//                log.printInfo();
//                System.out.println();
//            }
//        }
//    }

    public void printLogsByCategory(String category) {
        for (StudyLog log: logs) {
            if (log.getCategory().equals(category)) {
                log.printInfo();
                System.out.println();
            }
        }
    }


//    public void printJavaTotalMinutes() {
//        int totalMinutes = 0;
//
//        for (StudyLog log: logs) {
//            if (log.getCategory().equals("JAVA")) {
//                totalMinutes += log.getMinutes();
//            }
//        }
//
//        System.out.println("total minutes: " + totalMinutes);
//    }

//    public int getJavaTotalMinutes() {
//        int totalMinutes = 0;
//
//        for (StudyLog log: logs) {
//            if (log.getCategory().equals("JAVA")) {
//                totalMinutes += log.getMinutes();
//            }
//        }
//
//        return totalMinutes;
//    }

    public int getTotalMinutesByCategory(String category) {
        int totalMinutes = 0;

        for (StudyLog log: logs) {
            if (log.getCategory().equals(category)) {
                totalMinutes += log.getMinutes();
            }
        }

        return totalMinutes;

    }

}
