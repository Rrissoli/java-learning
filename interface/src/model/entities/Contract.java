package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer contractNumber;
    private LocalDate Date;
    private Double value;
    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer contractNumber, LocalDate date, Double value) {
        this.contractNumber = contractNumber;
        Date = date;
        this.value = value;
    }

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
    
  
    

}
