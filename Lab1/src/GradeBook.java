import Practice.Student;

import java.util.*;

public class GradeBook {
    private Course course;
    private Vector<Student> students;
    private Map<Student, Double> grades = new Hashtable<Student, Double>();
    public GradeBook(Course course, Vector<Student> students) {
        this.course = course;
        this.students = students;
    }
    public GradeBook(Course course) {
        this.course = course;
    }
    public GradeBook(Vector<Student> students) {
        this.students = students;
    }
    public void displayMessage(){
        System.out.println("Welcome to the " + course.getCourseCode() + " " + course.getCourseName() + " Gradebook!");
    }
    public void gradesInitialization(){
        System.out.println("Please, input ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < students.size(); i++){
            System.out.print(students.get(i).getName() + " : ");
            grades.put(students.get(i), input.nextDouble());

        }
    }
    public void displayGradeReport(){
        System.out.println("Class average: " + Double.toString(determineClassAverage()));
        System.out.println(findLowest());
        System.out.println(findHighest());
        outputBarChart();
    }
    private double determineClassAverage(){
        double total = 0;
        for (Student student : students){
            total += grades.get(student);
        }
        return total / students.size();
    }

    private String findLowest(){
        double lowest = 1000;
        Student stud = null;
        for (Student student : students){
            if (grades.get(student) < lowest){
                lowest = grades.get(student);
                stud = student;
            }
        }
        String res = "Lowest Grade is " + Double.toString(lowest) + " (" + stud.getName() + ", id: " + Integer.toString(stud.getId()) + ")";
        return res;
    }
    private String findHighest(){
        double highest = -10;
        Student stud = null;
        for (Student student : students){
            if (grades.get(student) > highest){
                highest = grades.get(student);
                stud = student;
            }
        }
        String res = "Lowest Grade is " + Double.toString(highest) + " (" + stud.getName() + ", id: " + Integer.toString(stud.getId()) + ")";
        return res;
    }

    private void outputBarChart(){
        Map<String, Integer> stars = new Hashtable();
        stars.put("00-09", 0);
        stars.put("10-19", 0);
        stars.put("20-29", 0);
        stars.put("30-39", 0);
        stars.put("40-49", 0);
        stars.put("50-59", 0);
        stars.put("60-69", 0);
        stars.put("70-79", 0);
        stars.put("80-89", 0);
        stars.put("90-99", 0);
        stars.put("100", 0);

        for(Student student : students){
            if (grades.get(student) == 100){
                stars.put("100", stars.get("100")+1);
            }
            else if (grades.get(student) >= 90){
                stars.put("90-99", stars.get("90-99")+1);
            }
            else if (grades.get(student) >= 80){
                stars.put("80-89", stars.get("80-89")+1);
            }
            else if (grades.get(student) >= 70){
                stars.put("70-79", stars.get("70-79")+1);
            }
            else if (grades.get(student) >= 60){
                stars.put("60-69", stars.get("60-69")+1);
            }
            else if (grades.get(student) >= 50){
                stars.put("50-59", stars.get("50-59")+1);
            }
            else if (grades.get(student) >= 40){
                stars.put("40-49", stars.get("40-49")+1);
            }
            else if (grades.get(student) >= 30){
                stars.put("30-39", stars.get("30-39")+1);
            }
            else if (grades.get(student) >= 20){
                stars.put("20-29", stars.get("20-29")+1);
            }
            else if (grades.get(student) >= 10){
                stars.put("10-19", stars.get("10-19")+1);
            }
            else if (grades.get(student) >= 0){
                stars.put("00-09", stars.get("00-09")+1);
            }
        }
        String[] order = {"00-09", "10-19", "20-29", "30-39", "40-49", "50-59", "60-69", "70-79", "80-89", "90-99", "100"};
        for (String s : order){
            String starsLine = "";
            for(int x = 0; x < stars.get(s); x++){
                starsLine += "*";
            }
            System.out.println(s+ ": " +  starsLine);
        }
    }
}
