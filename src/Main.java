public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Mikel", 100000, 1);
        employee[1] = new Employee("Franklin", 110000, 2);
        employee[2] = new Employee("Trevor", 95000, 3);
        employee[3] = new Employee("Lester", 120000, 4);
        employee[4] = new Employee("Dave", 130000, 5);
        employee[5] = new Employee("Lamar", 90000, 1);
        employee[6] = new Employee("Steve", 84000, 2);
        employee[7] = new Employee("Davin", 91000, 3);
        employee[8] = new Employee("Jimi", 105000, 4);
        employee[9] = new Employee("Bradly", 89000, 5);

        // Test easy
        Employee.listEmployees(employee);
        Employee.sumSalary(employee);
        Employee.maxSalary(employee);
        Employee.minSalary(employee);
        Employee.middleSalary(employee);
        Employee.indexSalary(employee, 1.15f);

        // Test upLevel
        int dep = 1;
        Employee.checkDepartmentMaxSalary(employee, dep);
        Employee.checkDepartmentMinSalary(employee, dep);
        Employee.checkDepartmentSumSalary(employee, dep);
        Employee.checkDepartmentMiddleSalary(employee, dep);
        Employee.checkDepartmentIndexSalary(employee, dep, 1.05f);
        Employee.checkDepartmentList(employee, dep);
        Employee.salaryLessValue(employee, 110000);
        Employee.salaryMoreValue(employee, 110000);

    }
}