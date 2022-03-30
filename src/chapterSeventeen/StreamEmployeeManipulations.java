package chapterSeventeen;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamEmployeeManipulations {

    Employee[] employees = {
            new Employee("Esther", "AKA I dont get", "IT", 60000),
            new Employee("Increse", "AKA can you rewind", "Collection", 60000),
            new Employee("Otunba", "AKA The lion in him", "Animal Husbandry", 60000),
            new Employee("Malik", "AKA Investor", "VC", 6000000),
            new Employee("Lota", "AKA We would get there", "Senior Dev", 600000),
    };

    List<Employee> employeeList = Arrays.asList(employees);
    Predicate<Employee> isInvestor = (department) -> department.getDepartment().equals("VC");
    Map<String, List<Employee>> employeeGroups = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
}

    class Employee{
        private String firstName;
        private String lastName;
        private String department;
        private int salary;

        public Employee(String firstName, String lastName, String department, int salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.department = department;
            this.salary = salary;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Employee{");
            sb.append("firstName='").append(firstName).append('\'');
            sb.append(", lastName='").append(lastName).append('\'');
            sb.append(", department='").append(department).append('\'');
            sb.append(", salary=").append(salary);
            sb.append('}');
            return sb.toString();
        }
    }

