public class Course {
    private String courseName;
    private String courseCode;
    private String courseDescription;
    private int courseCredits;
    private Course[] prerequisites;
    public Course(String courseName, String courseCode, String courseDescription, int courseCredits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        this.courseCredits = courseCredits;
    }
    public Course(String courseName, String courseCode, String courseDescription, int courseCredits, Course[] prerequisites) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        this.courseCredits = courseCredits;
        this.prerequisites = prerequisites;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public int getCourseCredits() {
        return courseCredits;
    }
    public Course[] getPrerequisites() {
        return prerequisites;
    }

}
