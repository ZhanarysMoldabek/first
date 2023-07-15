package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExamples {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-20);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(-2);
        arrayList.add(1);
        System.out.println("given list: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("sorted list: " + arrayList);
        int index1 = Collections.binarySearch(arrayList, 9);
        System.out.println("index of 9 is: " + index1);
        Collections.reverse(arrayList);
        System.out.println("reversed list: " + arrayList);

        Employee emp1 = new Employee("Zhanarys", 15, 10000);
        Employee emp2 = new Employee("Doszhan", 12, 112500);
        Employee emp3= new Employee("Gulzina", 25, 156320);
        Employee emp4 = new Employee("Bakytzhan", 85, 650060);
        Employee emp5 = new Employee("Zhandos", 1, 870563);
        Employee emp6 = new Employee("Korkem", 12, 4568);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee("Bakytzhan", 85, 650060));
        System.out.println("index is: " + index2);

        int[] array = {-3, 8, 1, -20, 0, 5, 9, -2, 1};
        System.out.println("given array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("sorted array: " + Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 5);
        System.out.println("index of 5 is: " + index3);
    }
}

class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private int salary;

    public Employee (String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" + "name: " + name + ", id: " + id + ", salary: " + salary + '}';
    }

    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}