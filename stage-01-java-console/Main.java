import java.util.List;
import java.util.Scanner;



public class Main {
    public static StudyCategory selectCategory(Scanner input) {
        StudyCategory category;
        System.out.print("select category \n");
        System.out.print("1.JAVA/ 2.GIT/ 3.SPRING/ 4.DATABASE/ 5. ETC: ");
        int num = input.nextInt();
        input.nextLine();


        switch (num) {
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
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1 - addlogs");
            System.out.println("2 - show all logs");
            System.out.println("3 - show logs by category");
            System.out.println("4 - show total minutes by category");
            System.out.println("0 - end");
            System.out.print("Please input number:");

            int number = input.nextInt();
            input.nextLine();

            if (number == 0) {
                System.out.println("program ended");
                break;
            } else if (number == 1) {
                System.out.print("title:");
                String title = input.nextLine();

                StudyCategory category = selectCategory(input);

                System.out.print("minutes:");
                int minutes = input.nextInt();
                input.nextLine();
                System.out.print("memo:");
                String memo = input.nextLine();

                manager.addLog(new StudyLog(title, category, minutes, memo));


            } else if (number == 2) {
                for (StudyLog log : manager.getAllLogs()) {
                    log.printInfo();
                    System.out.println();
                }
            } else if (number == 3) {
                StudyCategory category = selectCategory(input);

                for (StudyLog log : manager.getLogsByCategory(category)) {
                    log.printInfo();
                    System.out.println();
                }
            } else if (number == 4) {
                StudyCategory category = selectCategory(input);
                System.out.println(manager.getTotalMinutesByCategory(category));
            } else {
                System.out.println("invalid input");
            }
        }
    }
}
