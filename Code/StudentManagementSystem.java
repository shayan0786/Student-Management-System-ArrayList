import java.util.ArrayList;
class Student {
    int id;
    String name;
    int marks;
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<>();

        
        list.add(new Student(101, "Shayan", 90));
        list.add(new Student(102, "Aman", 85));
        list.add(new Student(103, "Rahul", 78));

        System.out.println("Before Update/Delete:");
        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
        int updateId = 102;

        for (Student s : list) {
            if (s.id == updateId) {
                s.name = "Aman Kumar";
                s.marks = 88;
                break;
            }
        }
        int deleteId = 101;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == deleteId) {
                list.remove(i);
                break;
            }
        }
        System.out.println("\nAfter Update/Delete:");
        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }
}