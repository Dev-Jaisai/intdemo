package org.interview;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create a list to hold Employee objects
        List<Employee> employees = new ArrayList<>();

        // Adding Employee objects to the list
        employees.add(new Employee(1, "John Doe", 75000.00, "Engineering", "123-456-7890", "New York"));
        employees.add(new Employee(2, "Jane Smith", 85000.00, "Marketing", "987-654-3210", "Los Angeles"));
        employees.add(new Employee(3, "Emily Johnson", 65000.00, "Finance", "456-789-1234", "Chicago"));
        employees.add(new Employee(4, "Michael Brown", 95000.00, "Sales", "789-123-4567", "Houston"));
        employees.add(new Employee(5, "Linda Williams", 55000.00, "HR", "321-654-9870", "San Francisco"));
        employees.add(new Employee(6, "Alex Green", 85000.00, "Engineering", "333-333-3333", "Boston"));
        employees.add(new Employee(7, "Jessica White", 1000000, "Marketing", "444-444-4444", "Los Angeles"));
        employees.add(new Employee(8, "Robert Black", 105000.00, "Sales", "555-555-5555", "Houston"));
        employees.add(new Employee(9, "Sophia Blue", 95000.00, "Finance", "666-666-6666", "Chicago"));

        //Employee who stays in city pune
        employees.stream().filter(x->x.getCity().equals("Pune"));
    }
}
