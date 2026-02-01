import java.util.ArrayList;
public class LMS {

    public static int countTotalBooks(ArrayList<BookItem> books) {
        return books.size();
    }

    public static void displaySystemMessage() {
        System.out.println("Welcome to Library Management System");
        System.out.println("Please follow library rules");
    }

    public static void main(String[] args) {

        displaySystemMessage();

        LibraryBook b1 = new LibraryBook("Java", "101", "James");
        LibraryBook b2 = new LibraryBook("Python", "102", "Guido", "Python Programming");

        ReferenceBook r1 = new ReferenceBook("DSA", "201", "Robert", "Data Structures");

        ArrayList<BookItem> list = new ArrayList<>();

        list.add(b1);
        list.add(b2);
        list.add(r1);

        b1.displayDetails();

        b1.issueBook("Shayan");

        b2.issueBook("Aman", 10);

        r1.issueBook();

        int total = countTotalBooks(list);

        System.out.println("Total Books in Library: " + total);
    }
}
