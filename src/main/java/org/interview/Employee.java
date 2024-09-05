package org.interview;
public class Employee {
    // Fields
    private long id;
    private String name;
    private double salary;
    private String department;
    private String contact;
    private String city;
    private String wdasf;
    private String vilage;


    private String city1;



    // Constructor
    public Employee(long id, String name, double salary, String department, String contact, String city) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.contact = contact;
        this.city = city;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", contact='" + contact + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
