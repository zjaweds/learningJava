import java.util.*;

class Student{
    String studentName;
    int classesAttended;
    int rollNo;
    int percentage;
    void addRecord(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter name of the student: ");
        studentName = scr.nextLine();
        System.out.print("Enter roll no: ");
        rollNo = scr.nextInt();
        classesAttended=0;
        percentage=0;
    }
    void updateAttendance(){
        classesAttended++;    
    }
    double calculatePercentage(int totalClassesHeld){
        return (classesAttended/totalClassesHeld)*100;
    }
}

class StudentRecords{
    void createStudentRecords(int numberOfStudents){
        Student [] students = new Student[numberOfStudents]; 
            for(int i=0;i<numberOfStudents;i++){
                students[0] = new Student();
                students[0].addRecord();
            }
    }
}

class ExternalLab{
    public static void main(String []a){
        System.out.println("Enter the number of students: ");
        Scanner sc = new Scanner(System.in);
        int nStudents = sc.nextInt();
        StudentRecords sr = new StudentRecords();
        sr.createStudentRecords(nStudents);
        System.out.println("Enter the number of classes held: ");
        int classesHeld = sc.nextInt();
        sc.close();
    }
}