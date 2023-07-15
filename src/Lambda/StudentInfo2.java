package Lambda;

import java.util.ArrayList;

public class StudentInfo2 { //results of StudentInfo and StudentInfo2 are the same
    void testStudents(ArrayList<Student> a1, StudentChecks sc) {
        for(Student s : a1) {
            if(sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Aleksandr", 'm', 20, 8.1);
        Student st2 = new Student("Novak", 'm', 32, 8.5);
        Student st3 = new Student("Elena", 'f', 28, 8.8);
        Student st4 = new Student("Iga", 'f', 23, 7.1);
        Student st5 = new Student("Medet", 'm', 17, 6.5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo2 studentInfo2 = new StudentInfo2();
//        studentInfo2.testStudents(students, new CheckOverGrade());
        System.out.println("******");
//        studentInfo2.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 25;
//            }
//        });
        studentInfo2.testStudents(students, (Student s) -> { //lambda expression
            return s.grade > 8;
        });
        System.out.println("*************");
        studentInfo2.testStudents(students, (Student s) -> { //lambda expression
            return s.age < 25;
        });
        System.out.println("*************");
        studentInfo2.testStudents(students, (Student s) -> { //lambda expression
            return s.age > 20 & s.grade < 7.9 & s.sex == 'f';
        });
    }
}

interface StudentChecks { //functional interface with only 1 abstract method
    boolean check(Student s); //for lambda expression there should be just 1 method
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.grade > 8;
    }
}
