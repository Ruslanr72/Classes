package Homework1;

public class Book {

    private int secondBookYear;
    private String secondBookName;
   private String bookName;
    private   String authorName;
  private   int bookYear;

    public Book (String bookName, int bookYear) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.secondBookName = bookName;
        this.secondBookYear = bookYear;
    }

    public String getBookName(){
        return this.bookName;
    }
    public String getSecondBookName() {
        return this.secondBookName;
    }
    public int getBookYear(){
        return this.bookYear;
    }
    public int getSecondBookYear() {
        return this.secondBookYear;
    }
public void setBookYear(int bookYear){
        this.bookYear = bookYear;this.secondBookYear = bookYear;
}
}
