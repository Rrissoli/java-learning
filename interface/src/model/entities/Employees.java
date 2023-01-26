package model.entities;

public class Employees implements Comparable<Employees> {
    
    private String name;
    private Double salary;
    public Employees(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public int compareTo(Employees other) {
        return name.compareTo(other.getName());
    }
    
}
