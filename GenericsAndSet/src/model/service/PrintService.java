package model.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    List <T> list = new ArrayList<>();
    public void addValue(T value){
        this.list.add(value);
    }
    public void print(){
        System.out.print("[");
        for (T item : list) {
            System.out.print(", " + item);
        }
        System.out.println("]");
    }
    public T first(){
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list.get(0);
    }
}
