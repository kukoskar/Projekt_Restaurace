package com.engeto.attributes;

import java.util.ArrayList;
import java.util.List;

public class Table implements Assignable {

    private Integer tableNo;

    public static List<Dish> orderList = new ArrayList<>();

    public static List<Waiter> listWaiter = new ArrayList<>();

    private String note;

    public Table(Integer tableNo, String note) {
        this.tableNo = tableNo;
        this.note = note;
    }

    public Table(Integer tableNo) {
        this(tableNo, "bez poznámky");
    }

    public Table() {
    }

    public Integer getTableNo() {
        return tableNo;
    }

    public void setTableNo(Integer tableNo) {
        this.tableNo = tableNo;
    }


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public static List<Dish> getOrderList() {
        return orderList;
    }

    public static void setOrderList(List<Dish> orderList) {
        Table.orderList = orderList;
    }

    public static List<Waiter> getListWaiter() {
        return listWaiter;
    }

    public static void setListWaiter(List<Waiter> listWaiter) {
        Table.listWaiter = listWaiter;
    }

    public void writeHeader() {
        System.out.println("** Objednávky pro stůl č. " + getTableNo() + " **" + "\n" + "****");
    }

    public void writeFooter() {
        System.out.println("******");
    }

    @Override
    public String toString() {
        return "Číslo stolu: " + getTableNo() + " poznámka: " + getNote();
    }

    @Override
    public String getOrderInfo() {
       return "Číslo stolu: " + getTableNo() + ". " + " poznámka: " + getNote();
    }



}

