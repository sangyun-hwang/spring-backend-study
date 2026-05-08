public class Main {
    public static void main(String[] args) {
        StudyLogManager manager = new StudyLogManager();
        String category = "JAVA";

        manager.addLog(new StudyLog("Java class practice", "JAVA", 60, "field and constructor"));
        manager.addLog(new StudyLog("Java array practice", "JAVA", 40, "array basics"));
        manager.addLog(new StudyLog("Git commit practice", "GIT", 30, "commit message"));

        System.out.println("total record");
        manager.printAllLogs();

        System.out.println(category + " record");
        manager.printLogsByCategory(category);
        int javaTotalMinutes = manager.getTotalMinutesByCategory(category);
        System.out.println("JAVA total minutes: " + javaTotalMinutes);
    }
}
