package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeHelper {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2,"Ashutosh",200.00,"Eng"));
        employees.add(new Employee(3,"Alok",200.00,"Data"));
        employees.add(new Employee(4,"Anshu",200.00,"Eng"));
        employees.add(new Employee(5,"Amrita",200.00,"IT"));
        employees.add(new Employee(6,"Akshat",200.00,"Data"));
        employees.add(new Employee(5,"Shabana",200.00,"IT"));



        /*
        Group Employee Based on their Department Id
         */

        Map<String, List<Employee>> group=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));


        group.forEach((department,employeeList)->{
            System.out.println(department+":->"+employeeList.stream().map(Employee::getName).collect(Collectors.joining(",")));
        });

    }
}
