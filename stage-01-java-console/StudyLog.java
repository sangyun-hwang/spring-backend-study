public class StudyLog {
    private final String title;
    private final StudyCategory category;
    private final int minutes;
    private final String memo;

    public StudyLog(String title, StudyCategory category, int minutes, String memo) {
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

