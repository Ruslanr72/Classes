package Homework1;

public class Main {
    public static void main(String[] args) {
        Book workbook = new Book("Workbook", 2022);
        Author authorOfWorkbook = new Author("Muslimov Ruslan");
        System.out.println("Homework1.Book name is - " + workbook.getBookName() + ".");
        System.out.println("Homework1.Author name is - " + authorOfWorkbook.getAuthorName() + ".");
        System.out.println("The book year is - " + workbook.getBookYear() + ".");
        workbook.setBookYear(2000);
        System.out.printf("Set year of book is - " + workbook.getBookYear());

        System.out.println("\n====================");

        Authors secondWorkbook = new Authors("Second Workbook", 2001);
        Authors authorOfSecondWorkbook = new Authors("Elvira");
        System.out.println("Homework1.Book name is - " + secondWorkbook.getSecondBookName() + ".");
        System.out.println("Homework1.Author name is - " + authorOfSecondWorkbook.getSecondAuthorName() + ".");
        System.out.println("The book year is - " + secondWorkbook.getSecondBookYear() + ".");
        secondWorkbook.setSecondBookYear(2020);
        System.out.println("Set year of book is -  " + secondWorkbook.getSecondBookYear());
    }
    }
