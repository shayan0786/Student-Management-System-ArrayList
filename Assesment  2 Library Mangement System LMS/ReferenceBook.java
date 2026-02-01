class ReferenceBook extends LibraryBook {

    private String description;

    public ReferenceBook(String title, String bookId, String author, String description) {
        super(title, bookId, author);
        this.description = description;
    }

    @Override
    public void issueBook() {
        System.out.println("Reference books cannot be issued, only viewed in the library.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Book ID: " + bookId);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Status: Reference (in-library use only)");
    }
}
