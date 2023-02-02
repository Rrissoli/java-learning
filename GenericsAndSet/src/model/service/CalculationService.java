package model.service;

import java.util.ArrayList;
import java.util.List;

public class CalculationService {
   
    public static Integer max(List <Integer> list){
        if (list.isEmpty()) {
            throw new IllegalStateException();
        }
        Integer max = list.get(0);
        for (Integer item : list) {
            if(item > max){
                max = item;
            }
            
        }
        return max;
    }
}
