package Homework1;

import java.util.Objects;

public class Book {
   private String bookName;
  private   int bookYear;

    public Book (String bookName, int bookYear) {
        this.bookName = bookName;
        this.bookYear = bookYear;
    }
    public int getBookYear(){
        return this.bookYear;
    }
public void setBookYear(int bookYear){
        this.bookYear = bookYear;
}
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book workbook = (Book) other;
        return workbook.equals(workbook.bookName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
    @Override
    public String toString() {
        return "Book name is -  " + bookName + ". " + "\nThe book year is - " + bookYear + "." + "\nAuthor name is - ";
    }
}
