package Collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Student> classmates = new ArrayList<>(10);
        Student st1 = new Student("Zhanarys", 20, 3);
        Student st2 = new Student("Nurbolat", 19, 2);
        Student st3 = new Student("Aidar", 21, 1);
        classmates.add(st1);
        classmates.add(st2);
        classmates.add(st3);
        System.out.println(classmates);
        Student st4 = new Student("Nurbolat", 19, 2);
        classmates.remove(st4); // обьект аркылы удаление болып жатр индекс емес, метод еквалс комектести интеллайджи усынган
        System.out.println(classmates);
    }
}
class Student {
    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

     public String toString() {
        return "Student{" + "name: " + name + ", age: " + age + ", course: " + course + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Objects.equals(name, student.name);
    }

}
