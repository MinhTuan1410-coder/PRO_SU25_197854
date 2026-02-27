/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Trần Minh Tuấn
 */
public class Book {

    private int id;
    private String title;
    private String author;
    private int pageCount;

    public Book(int id, String title, String author, int pageCount) {
        this.id = id;
        this.title = title;
        this.author = author;

        if (pageCount < 100) {
            this.pageCount = 100;
        } else {
            this.pageCount = pageCount;
        }

    }

    public String getTitle() {
        if (this.title.length() >= 6) {
            return this.title.toUpperCase();
        }
        return "N/A";
    }

    public String getAuthor() {
        if (this.author.isEmpty()) {
            return "N/A";
        }
        return this.author.toUpperCase();
    }

    @Override
    public String toString() {
        return this.id + ", " + this.title.toUpperCase() + ", " + this.author.toUpperCase() + ", " + this.pageCount;
    }

}
