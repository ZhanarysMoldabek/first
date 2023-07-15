package Lambda;

import java.util.ArrayList;

public class StudentInfo { //results of StudentInfo and StudentInfo2 are the same
    public static void main(String[] args) {
        Student st1 = new Student("Zhanarys", 'm', 20, 8.1);
        Student st2 = new Student("Kanat", 'm', 32, 8.5);
        Student st3 = new Student("Gulnur", 'f', 28, 8.8);
        Student st4 = new Student("Aigul", 'f', 23, 7.1);
        Student st5 = new Student("Nurbak", 'm', 17, 6.5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentsOverGrade(students, 8.0);
        System.out.println("*******************");
        studentInfo.printStudentsUnderAge(students, 25);
        System.out.println("*******************");
        studentInfo.printStudentsMixCondition(students, 20, 7.9, 'f');
    }
    void printStudentsOverGrade(ArrayList<Student> a1, double grade) {
        for(Student s : a1) {
            if(s.grade > grade) {
                System.out.println(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> a1, int age) {
        for(Student s : a1) {
            if(s.age < age) {
                System.out.println(s);
            }
        }
    }
    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex) {
        for(Student s : a1) {
            if(s.age > age & s.grade < grade & s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
class Student {
    String name;
    char sex;
    int age;
    double grade;

    public Student(String name, char sex, int age, double grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}