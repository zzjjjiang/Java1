package com.xpanxion.assignments.student.Java2;

import java.sql.Array;
import java.util.ArrayList;

public class Invoice {
    private int id;
    private ArrayList<Product> prods;
    public Invoice(int id){
        this.id = id;
        this.prods = new ArrayList<>();
    }

    public void addProduct(Product a){
        prods.add(a);
    }
    public double getTotalCost(){
        return prods.stream().mapToDouble(Product::getCost).sum();
    }
}
