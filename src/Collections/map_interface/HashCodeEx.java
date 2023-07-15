package Collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student, Double> map1 = new HashMap<>();
        Student st1 = new Student("Zhanarys" ," Moldabek", 3 );
        Student st2 = new Student("Aidar" ," Naimash", 3 );
        Student st3 = new Student("Nurbolat" ," Barat", 3 );
        Student st4 = new Student("Sultan" ," Razymkhan", 4 );
        map1.put(st1, 7.5);
        map1.put(st2, 8.5);
        map1.put(st3, 6.5);
        map1.put(st4, 9.5);
        System.out.println(map1);
        Student st5 = new Student("Sultan" ," Razymkhan", 4 );
        System.out.println(map1.containsKey(st5));
        System.out.println(st5.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());  //каждый новосозданный обьект имеет уникальный хэшкод если не реализован хэшкод
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String toString() {
        return "[Student name: " + name + ", username: "  + surname + ", course: " + course + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
