import java.util.*;

class EmployeeManager {
    HashMap<Integer, Employee> employees = new HashMap<>();

    void addEmployee(int id, String name, double salary) {
        employees.put(id, new Employee(id, name, salary));
        System.out.println("Employee Added!");
    }

    void showAll() {
        for (Employee e : employees.values()) {
            e.display();
        }
    }

    void deleteEmployee(int id) {
        if (employees.remove(id) != null) {
            System.out.println("Employee Removed!");
        } else {
            System.out.println("Employee Not Found!");
        }
    }

    void updateEmployee(int id, String name, double salary) {
        if (employees.containsKey(id)) {
            employees.put(id, new Employee(id, name, salary));
            System.out.println("Employee Updated!");
        } else {
            System.out.println("Employee Not Found!");
        }
    }
}