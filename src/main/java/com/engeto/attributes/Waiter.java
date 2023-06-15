package com.engeto.attributes;

public class Waiter implements Assignable {

    private int waiterNo;

    public Waiter(int waiterNo) {
        this.waiterNo = waiterNo;
    }

    public int getWaiterNo() {
        return waiterNo;
    }

    public void setWaiterNo(int waiterNo) {
        this.waiterNo = waiterNo;
    }

    public String getOrderInfo() {
        return " číšník č. " + getWaiterNo();
    };

    @Override
    public String toString() {
        return   " číšník č. " + getWaiterNo();
    }



}
