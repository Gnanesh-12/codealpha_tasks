import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    public static double getAverage(ArrayList<Student> students) {
        int total = 0;
        for (Student s : students) {
            total += s.marks;
        }
        return (double) total / students.size();
    }

    public static int getHighest(ArrayList<Student> students) {
        int highest = Integer.MIN_VALUE;
        for (Student s : students) {
            if (s.marks > highest) {
                highest = s.marks;
            }
        }
        return highest;
    }

    public static int getLowest(ArrayList<Student> students) {
        int lowest = Integer.MAX_VALUE;
        for (Student s : students) {
            if (s.marks < lowest) {
                lowest = s.marks;
            }
        }
        return lowest;
    }

    public static void displayAllStudents(ArrayList<Student> students) {
        for (Student s : students) {
            s.display();
        }
    }
}

public class studentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();



            students.add(new Student(name, marks));
        }

        System.out.println("\n=== Student Summary Report ===");
        Student.displayAllStudents(students);

        System.out.println("\nAverage Marks: " + Student.getAverage(students));
        System.out.println("Highest Marks: " + Student.getHighest(students));
        System.out.println("Lowest Marks: " + Student.getLowest(students));
    }
}
