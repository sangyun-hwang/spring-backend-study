public class StudyLog {
    private final String title;
    private final StudyCategory category;
    private final int minutes;
    private final String memo;

    public StudyLog(String title, StudyCategory category, int minutes, String memo) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title must not be blank");
        }
        if (minutes <= 0) {
            throw new IllegalArgumentException("minutes must be greater than 0");
        }

        this.title = title;
        this.category = category;
        this.minutes = minutes;
        this.memo = memo;

    }

    public void printInfo() {
        System.out.println("title: " + title);
        System.out.println("category: " + category);
        System.out.println("minutes: " + minutes);
        System.out.println("memo: " + memo);
    }

    public String getTitle() {
        return title;
    }

    public StudyCategory getCategory() {
        return category;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getMemo() {
        return memo;
    }
}

