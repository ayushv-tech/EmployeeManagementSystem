import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n=== Employee Menu ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Show All");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    manager.addEmployee(id, name, salary);
                    break;

                case 2:
                    manager.showAll();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter new salary: ");
                    double usalary = sc.nextDouble();

                    manager.updateEmployee(uid, uname, usalary);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    manager.deleteEmployee(did);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}