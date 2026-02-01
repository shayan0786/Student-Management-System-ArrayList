class LibraryBook extends BookItem {

    private boolean isAvailable = true;
    private String issuedTo = "None";
    private String description;

    public LibraryBook(String title, String bookId, String author) {
        super(title, bookId, author);
        this.description = "No description provided";
    }

    public LibraryBook(String title, String bookId, String author, String description) {
        super(title, bookId, author);
        this.description = description;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean value) {
        this.isAvailable = value;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(String name) {
        this.issuedTo = name;
    }

    public void issueBook() {
        if (getIsAvailable()) {
            setIsAvailable(false);
            setIssuedTo("None");
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book already issued");
        }
    }

    public void issueBook(String studentName) {
        if (getIsAvailable()) {
            setIsAvailable(false);
            setIssuedTo(studentName);
            System.out.println("Book issued to " + studentName);
        } else {
            System.out.println("Book already issued");
        }
    }

    public void issueBook(String studentName, int days) {
        if (getIsAvailable()) {
            setIsAvailable(false);
            setIssuedTo(studentName);

            if (days > MAX_ISSUE_DAYS) {
                System.out.println("Warning: Issue duration exceeds MAX_ISSUE_DAYS");
            }

            System.out.println("Book issued to " + studentName);
            System.out.println("Issue Days: " + days);
        } else {
            System.out.println("Book already issued");
        }
    }

    public void returnBook() {
        if (!getIsAvailable()) {
            setIsAvailable(true);
            setIssuedTo("None");
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book was not issued");
        }
    }

    @Override
    public void displayDetails() {

        System.out.println("Title: " + title);
        System.out.println("Book ID: " + bookId);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);

        if (getIsAvailable()) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Issued to " + getIssuedTo());
        }

        System.out.println("Max Issue Days: " + MAX_ISSUE_DAYS);
    }
}