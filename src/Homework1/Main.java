package Homework1;

public class Main {
    public static void main(String[] args) {
        Book workbook = new Book("Workbook", 2022);
        Author authorOfWorkbook = new Author("Muslimov Ruslan");
        System.out.println("Book name is - " + workbook.getBookName() + ".");
        System.out.println("Author name is - " + authorOfWorkbook.getAuthorName() + ".");
        System.out.println("The book year is - " + workbook.getBookYear() + ".");
        workbook.setBookYear(2000);
        System.out.printf("Set year of book is - " + workbook.getBookYear());

        System.out.println("\n====================");

        Book secondWorkbook = new  Book("Second Workbook", 2001);
        Author authorOfSecondWorkbook = new Author("Elvira");
        System.out.println("Book name is - " + secondWorkbook.getSecondBookName() + ".");
        System.out.println("Author name is - " + authorOfSecondWorkbook.getSecondAuthorName() + ".");
        System.out.println("The book year is - " + secondWorkbook.getSecondBookYear() + ".");
        secondWorkbook.setBookYear(2020);
        System.out.println("Set year of book is -  " + secondWorkbook.getSecondBookYear());
    }
    }
