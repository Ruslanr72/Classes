package Homework1;

public class Author {
    private String secondAuthorName;
  private   String authorName;


    public Author(String nameAuthor) {
        this.authorName = nameAuthor; this.secondAuthorName = nameAuthor;
    }

    public String getAuthorName () {
        return this.authorName;
    }
    public String getSecondAuthorName() {
        return this.secondAuthorName;
    }
}

