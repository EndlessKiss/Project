public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Anisimova A.V.", 1, 2500);
        employees[1] = new Employee("Anisimov D.O.", 3, 1700);
        employees[2] = new Employee("Anisimova K.O.", 2, 2000);
        employees[3] = new Employee("Anisimova M.O.", 1, 2000);
        employees[4] = new Employee("Smirnova D.V.", 4, 1200);
        employees[5] = new Employee("Dimov V.V.", 5, 2000);
        employees[6] = new Employee("Amova L.F.", 1, 1500);
        employees[7] = new Employee("Isimova H.D.", 2, 1500);
        employees[8] = new Employee("Petrova A.A.", 3, 1500);
        employees[9] = new Employee("Aiva S.S.", 5, 1500);
        for (Employee e : employees) {
            System.out.println(e);
        }
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            minSalary = Math.min(minSalary, employee.getSalary());
        }
        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            maxSalary = Math.max(maxSalary, employee.getSalary());
        }
        System.out.println("Total Salary:$ " + totalSalary);
        System.out.println("Minimum salary:$ " + minSalary);
        System.out.println("Maximum salary:$ " + maxSalary);
        double averageSalary = totalSalary / employees.length;
        System.out.println("Average salary:$ " + averageSalary);
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}