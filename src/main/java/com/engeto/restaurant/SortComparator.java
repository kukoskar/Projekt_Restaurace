package com.engeto.restaurant;

import java.util.Comparator;

public class SortComparator implements Comparator<Order> {

        public int compare(Order first, Order second)
        {
            return first.getWaiterNo() - (second.getWaiterNo());
        }

}
