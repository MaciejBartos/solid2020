package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {

    private Map<Integer, String> pages;

    private String title;
    private String author;

    public Book(String author, String title, HashMap<Integer, String> pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    /**
     * Get the number of all pages.
     *
     * @return
     */
    public int getNumberOfPages() {
        return pages.size();
    }

    /**
     * Get the content of given page.
     *
     * @param pageNumber
     * @return
     */
    public String getPageContent(int pageNumber) {
        return pages.get(pageNumber + 1);
    }


}
