package day05.practice.packageTwo;

public class DepartmentTest {

    public static void main(String[] args) {
        Department department = new Department("Bio Maths", 983);
        Student student = new Student("Jayaprakash", 786, department);
        System.out.println(student);
    }
}
