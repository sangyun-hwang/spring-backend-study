import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudyLogManager manager = new StudyLogManager();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("1 - addlogs/ 0 - end:");
            int number = input.nextInt();
            input.nextLine();

            if (number == 0) {
                System.out.println("program ended");
                break;
            } else if (number == 1) {
                System.out.print("title:");
                String title = input.nextLine();

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

                System.out.print("minutes:");
                int minutes = input.nextInt();
                input.nextLine();
                System.out.print("memo:");
                String memo = input.nextLine();

                manager.addLog(new StudyLog(title, category, minutes, memo));


            } else {
                System.out.println("invalid input");
            }
        }

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
