package entitiese;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;
import entitiese.Department;

public class Workers {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Workers(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    public Department getDepartment() {
        return department;
    }
    public List<HourContract> getContracts() {
        return contracts;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public WorkerLevel getLevel() {
        return level;
    }
    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public void addContract (HourContract contract){
        this.contracts.add(contract);
    }
    public void removeContract (HourContract contract){
        this.contracts.remove(contract);
    }
    public Double income (int year, int month){
            double soma = this.baseSalary;
            Calendar cal = Calendar.getInstance();            
            for (HourContract contract : contracts) {
                cal.setTime(contract.getDate());
                int c_year = cal.get(year);
                int c_month = 1 + cal.get(month);
                if(year == c_year && month == c_month){
                    soma += contract.totalValue();
                }

            }
            return soma;
    } 
    @Override
    public String toString() {
        return "Workers [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + ", department="
                + department + ", contracts=" + contracts + "]";
    }

}
