package entitiese;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.crypto.Data;

import entities.enums.OrderStatus;
import entitiese.OrderItem;
public class Ordr2 {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> contracts = new ArrayList<>();
    private Client cliente;


}
