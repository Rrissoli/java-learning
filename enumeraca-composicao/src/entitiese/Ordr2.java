package entitiese;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.crypto.Data;

import entities.enums.OrderStatus;
import entitiese.OrderItem;
public class Ordr2 {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<OrderItem>();
    public Ordr2() {
    }
    public Ordr2(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem(OrderItem item){
        this.items.add(item);
    }
    public void removeItem(OrderItem item){
        this.items.remove(item);
    }
    public double total(){
        double total = 0.0;
        for (OrderItem item : this.items) {
            total += item.subTotal();
        }
        return total;
    }
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order Moment: ");
    sb.append(sdf.format(moment) +"/n");
    sb.append("Order Status: ");
    sb.append(status + "/n");
    sb.append("Client: ");
    sb.append(client + "/n");
    sb.append("Order items: \n");
    for (OrderItem item : items) {
        sb.append(item + "\n");
    }    
    sb.append("Total price: $");
    sb.append(String.format("%.2f", total()));
    return sb.toString();
    }
    

}
