package entitiese;

import entities.enums.OrderStatus;
import java.util.Date;
public class Order {
    private Integer id;
    private Date  moment;
    private OrderStatus status;
    public Order (){

    }
    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }
    public Integer getId() {
        return id;
    }
    public Date getMoment() {
        return moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "id=" + id + ", moment=" + moment + ", status=" + status ;
    }
    
    
}
