import java.util.Objects;

public class Employee {

    private final String name;
    private float salary;
    private int department;
    private int id = 0;
    private static int count = 1;
    public Employee(String name, float salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = count++;
    }
    public static void listEmployees(Employee[] employee) { // метод списка всех сотрудников
        for (Employee value : employee) {
            System.out.println(value.toString());
        }
    } // список всех сотрудников
    public static void sumSalary(Employee[] employee) { // метод всех зп
        float temp = 0;
        for (Employee value : employee) {
            temp = value.salary + temp;
        }
        System.out.println("Сумма затрат: " + temp);
    } // Метод всех зп
    public static void maxSalary(Employee[] employee) { // метод максимальной зп
        float temp = 0;
        String tempName = "";
        for (Employee value : employee) {
            if (value.salary > temp) {
                temp = value.salary;
                tempName = value.name;
            }
        }
        System.out.println("Максимальная зп у " + tempName + " " + temp + " рублей");
    } // Макс зп
    public static void minSalary(Employee[] employee) { // метод минимальной зп
        float temp = Integer.MAX_VALUE;
        String tempName = "";
        for (Employee value : employee) {
            if (value.salary < temp) {
                temp = value.salary;
                tempName = value.name;
            }
        }
        System.out.println("Минимальная зп у " + tempName + " " + temp + " рублей");
    } // Мин зп
    public static void middleSalary(Employee[] employee) {
        int temp = 0;
        for (Employee value : employee) {
            temp += (int) value.salary;
        }
        temp = temp / employee.length;
        System.out.println(temp);
    } // Средняя зп
    public static void indexSalary(Employee[] employee, float index) {
        for (Employee value : employee) {
            float temp = value.salary;
            value.salary = (int) (value.salary * index);
            System.out.println("Зарплата сотрудника " + value.getName() + " Изменилась на " + (value.salary - temp));
        }
    } // Индексируем зп
    public static void checkDepartmentMaxSalary(Employee[] employee, int dep) { //
        String tempName = "";
        float tempSalary = 0;
        for (Employee value : employee) {
            if (value.getDepartment() == dep && value.salary > tempSalary) {
                tempSalary = value.salary;
                tempName = value.getName();
            }
        }
        System.out.println("В " + dep + " отделе зарплата больше у " + tempName);
    }
    public static void checkDepartmentMinSalary(Employee[] employee, int dep) { //
        String tempName = "";
        float tempSalary = Integer.MAX_VALUE;
        for (Employee value : employee) {
            if (value.getDepartment() == dep && value.salary < tempSalary) {
                tempSalary = value.salary;
                tempName = value.getName();
            }
        }
        System.out.println("В " + dep + " отделе зарплата меньше у " + tempName);
    }
    public static void checkDepartmentSumSalary(Employee[] employee, int dep) {
        float tempMiddleSalary = 0;
        for (Employee value : employee) {
            if (value.getDepartment() == dep) {
                tempMiddleSalary += value.salary;
            }
        }
        System.out.println("Вcего затрат у " + dep + " отдела " + tempMiddleSalary + " рублей ");
    }
    public static void checkDepartmentMiddleSalary(Employee[] employee, int dep) {
        int tempCount = 0;
        float tempMiddleSalary = 0;
        for (Employee value : employee) {
            if (value.getDepartment() == dep) {
                tempCount++;
                tempMiddleSalary += value.salary;
            }
        }
        System.out.println("Средняя зарплата у " + dep + " отдела " + (tempMiddleSalary / tempCount) + " рублей ");
    }
    public static void checkDepartmentIndexSalary(Employee[] employee, int dep, float index) {
        for(Employee value : employee) {
            if (value.getDepartment() == dep) {
                value.salary *= index;
                System.out.println("Зарплата у " + value.getName() + " повысилась на " + String.format("%.2f",value.salary * index - value.salary) + " рублей." );
            }
        }
    }
    public static void checkDepartmentList(Employee[] employee, int dep) {
        for(Employee value : employee) {
            if (value.getDepartment() == dep) {
                System.out.println(value.getName() + " " + value.salary);
            }
        }
    } // Отделы
    public static void salaryLessValue(Employee[] employee, int valueSalary) {
        for (Employee value : employee) {
            if (value.salary <= valueSalary) {
                System.out.println(value.id + ")" + value.getName() + " " + value.salary);
            }
        }
    }
    public static void salaryMoreValue(Employee[] employee, int valueSalary) {
        for (Employee value : employee) {
            if (value.salary >= valueSalary) {
                System.out.println(value.id + ")" + value.getName() + " " + value.salary);
            }
        }
    }
    public int getDepartment() {
        return department;
    }
    public float getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public boolean equals(Employee employee) {
        if (this.getName() != employee.getName() && this.getSalary() != employee.getSalary() && this.getDepartment() != employee.getDepartment() ) {
            return false;
        } else {
            return true;
        }
    }
    public String toString() {
        return id + ")" + getName() +  ", salary: " + getSalary() + ", Department: " + getDepartment();
    }
}