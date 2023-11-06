package pro.sky.java.course1.HW12;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        if (author.isEmpty()) {
            this.name = name;
            this.author = "Автор не указан";
            this.year = year;
        } else {
            this.name = name;
            this.author = author;
            this.year = year;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}