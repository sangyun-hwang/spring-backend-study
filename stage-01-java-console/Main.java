import java.util.List;
import java.util.Scanner;

public class Main {
    public static StudyCategory selectCategory(Scanner scanner) {
        StudyCategory category;
        System.out.print("select category \n");
        System.out.print("1.JAVA/ 2.GIT/ 3.SPRING/ 4.DATABASE/ 5. ETC: ");
        int categoryNumber = scanner.nextInt();
        scanner.nextLine();

        switch (categoryNumber) {
            case 1:
                category = StudyCategory.JAVA;
                break;
            case 2:
                category = StudyCategory.GIT;
                break;
            case 3:
                category = StudyCategory.SPRING;
                break;
            case 4:
                category = StudyCategory.DATABASE;
                break;
            case 5:
                category = StudyCategory.ETC;
                break;
            default:
                throw new IllegalArgumentException("category is not enum");
        }

        return category;
    }

    public static void main(String[] args) {
        StudyLogManager manager = new StudyLogManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Add log");
            System.out.println("2 - Show all logs");
            System.out.println("3 - Show logs by category");
            System.out.println("4 - Show total minutes by category");
            System.out.println("0 - End");
            System.out.print("Please input menu number:");

            int menuNumber = scanner.nextInt();
            scanner.nextLine();

            if (menuNumber == 0) {
                System.out.println("program ended");
                break;
            } else if (menuNumber == 1) {
                System.out.print("title:");
                String title = scanner.nextLine();

                StudyCategory category = selectCategory(scanner);

                System.out.print("minutes:");
                int minutes = scanner.nextInt();
                scanner.nextLine();
                System.out.print("memo:");
                String memo = scanner.nextLine();

                manager.addLog(new StudyLog(title, category, minutes, memo));
                System.out.println("log added");

            } else if (menuNumber == 2) {
                List<StudyLog> allLogs = manager.getAllLogs();

                if (allLogs.isEmpty()) {
                    System.out.println("no logs");
                } else {
                    for (StudyLog log : allLogs) {
                        log.printInfo();
                        System.out.println();
                    }
                }
            } else if (menuNumber == 3) {
                StudyCategory category = selectCategory(scanner);
                List<StudyLog> logsByCategory = manager.getLogsByCategory(category);

                if (logsByCategory.isEmpty()) {
                    System.out.println("no logs");
                } else {
                    for (StudyLog log : logsByCategory) {
                        log.printInfo();
                        System.out.println();
                    }
                }
            } else if (menuNumber == 4) {
                StudyCategory category = selectCategory(scanner);
                System.out.println(manager.getTotalMinutesByCategory(category));
            } else {
                System.out.println("invalid input");
            }
        }
    }
}
