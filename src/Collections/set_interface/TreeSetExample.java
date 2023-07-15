package Collections.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(5);
        ts.add(3);
        ts.add(15);
        ts.add(8);
        ts.add(7);
        // ts.add(); do not save null elements
        System.out.println(ts);
        ts.remove(3);
        System.out.println(ts.contains(3));
        System.out.println(ts.first()); //the minimum
        System.out.println(ts.last()); //the maximum
        System.out.println(ts.higher(5)); //bigger number after the given integer
        System.out.println(ts.higher(15)); //if there is no bigger number, will be return null

        TreeSet<Student> ts1 = new TreeSet<>();
        Student st1 = new Student("Zhanarys", 3);
        Student st2 = new Student("Zhandos", 1);
        Student st3 = new Student("Korkem", 2);
        Student st4 = new Student("Doszhan", 5);
        Student st5 = new Student("Madina", 4);
        ts1.add(st1);
        ts1.add(st2);
        ts1.add(st3);
        ts1.add(st4);
        ts1.add(st5);
        System.out.println(ts1);
        Student st6 = new Student("Madina", 4);
        System.out.println(ts1.tailSet(st6)); //higher objects and equal
        System.out.println(ts1.headSet(st6)); //lower objects
        System.out.println(st6.equals(st5));
        System.out.println(st6.hashCode() == st5.hashCode());
        System.out.println(ts1.subSet(st2, st6));
    }
}

class Student implements Comparable<Student>{ //if there will be object in treeSet, comparable class should be implemented
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course; //there should be just course point, because in compareTo part just course
    }

    @Override
    public int hashCode() {
        return Objects.hash(course); //there should be just course point, because in compareTo part just course

    }
}
