import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyLogManager manager = new StudyLogManager();

        manager.addLog(new StudyLog("Java class practice", StudyCategory.JAVA, 60, "field and constructor"));
        manager.addLog(new StudyLog("Java array practice", StudyCategory.JAVA, 40, "array basics"));
        manager.addLog(new StudyLog("Git commit practice", StudyCategory.GIT, 30, "commit message"));

        System.out.println("total record");
        for (StudyLog log : manager.getAllLogs()) {
            log.printInfo();
            System.out.println();
        }

        System.out.println(StudyCategory.JAVA + " record");
        for (StudyLog log : manager.getLogsByCategory(StudyCategory.JAVA)) {
            log.printInfo();
            System.out.println();
        }


        int totalMinutesByCategory  = manager.getTotalMinutesByCategory(StudyCategory.JAVA);
        System.out.println("JAVA total minutes: " + totalMinutesByCategory);
    }
}
