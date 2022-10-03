public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Cansu", 1500, 35, 2020);
        employee1.toString();
        employee1.raiseSalary();

        Employee employee2 = new Employee("Zeynep", 5000, 80, 2000);
        employee2.toString();
        employee2.raiseSalary();
    }
}
