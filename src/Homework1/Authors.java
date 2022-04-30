package Homework1;

public class Authors {
    private int secondBookYear;
    private String secondBookName;
    private String secondAuthorName;


    public Authors(String secondAuthorName) {
        this.secondAuthorName = secondAuthorName;
    }

    public String getSecondAuthorName() {
        return this.secondAuthorName;
    }

    public Authors(String secondBookName, int secondBookYear) {
        this.secondBookName = secondBookName;
        this.secondBookYear = secondBookYear;
    }

    public String getSecondBookName() {
        return this.secondBookName;
    }

    public int getSecondBookYear() {
        return this.secondBookYear;
    }

    public void setSecondBookYear(int secondBookYear) {
        this.secondBookYear = secondBookYear;
    }
}

