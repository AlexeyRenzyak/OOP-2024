import Practice.Student;

import java.util.Vector;

public class GradeBookTest {
    public static void main() {
        Course c1 = new Course("Sample Discipline", "SC322", "Course Test", 9001);
        Student student1 = new Student("MASTER", 1);
        Student student2 = new Student("Boss", 2);
        Student student3 = new Student("Hacker", 3);
        Student student4 = new Student("Billy", 4);
        Student student5 = new Student("Van", 5);
        Vector<Student> studs = new Vector<Student>();
        studs.add(student1);
        studs.add(student2);
        studs.add(student3);
        studs.add(student4);
        studs.add(student5);

        GradeBook gBook = new GradeBook(c1, studs);
        gBook.displayMessage();
        gBook.gradesInitialization();
        gBook.displayGradeReport();
    }
}
