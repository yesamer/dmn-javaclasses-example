package dto;

public class Book {

    private Integer year;
    private String author;
    private String title;
    private int pages;

    public Book(Integer year, String author, String title, int pages) {
        this.year = year;
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
