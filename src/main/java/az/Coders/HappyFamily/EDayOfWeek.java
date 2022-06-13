package az.Coders.HappyFamily;

public enum EDayOfWeek {
    Monday("1"),
    Tuesday("2"),
    Wednesday("3"),
    Thursday("4"),
    Friday("5"),
    Saturday("6"),
    Sunday("7");

    private String daysByNumber;
    EDayOfWeek(String daysByNumber) {
        this.daysByNumber=daysByNumber;
    }

    public String getDaysByNumber() {
        return daysByNumber;
    }

    public void setDaysByNumber(String daysByNumber) {
        this.daysByNumber = daysByNumber;
    }
}
