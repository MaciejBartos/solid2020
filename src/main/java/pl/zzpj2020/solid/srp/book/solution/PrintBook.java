package pl.zzpj2020.solid.srp.book.solution;

public class PrintBook {

    /**
     * Prints the current page.
     */
    public void printBookPage(Book book, int page) {
        if (page <= book.getNumberOfPages() && page > 0)
        System.out.println(book.getPageContent(page));
    }

    /**
     * Prints all pages
     */
    public void printBookAllPages(Book book) {

        for (int page = 0; page < book.getNumberOfPages(); page++) {
            System.out.println(book.getPageContent(page));
        }
    }
}
