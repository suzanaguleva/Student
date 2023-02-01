package student;

public class PartTimeStudent extends Student {
    private int numberOfCourses;

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public PartTimeStudent(int numberOfCourses, String studentId, String studentName) {
        super(studentId, studentName);
        this.numberOfCourses = numberOfCourses;
    }
}
