package student;

public class StudentList {
    public static void main(String[] args){
        //Student obj = new Student("s1","ronak");
        Student[] studentList = new Student[3];
        studentList[0] = new Student("s1","kiran");
        studentList[1] = new Student("s2","suzzie");
        studentList[2] = new Student("s3","atiqa");

        for (Student studentList1 : studentList) {
            System.out.println(studentList1.getStudentName());
        }
    }//end of method
}//end of main
