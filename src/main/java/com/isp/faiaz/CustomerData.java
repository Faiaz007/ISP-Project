package com.isp.faiaz;

import java.util.ArrayList;
import java.util.List;

public class CustomerData {
    private static final List<Customer> customerList = new ArrayList<>();

    static {
        Customer c1 = new Customer("C001", "Mamun", "123456", 28);
        c1.setBillAmount(0);
        c1.setHasIssue(false);

        Customer c2 = new Customer("C002", "Dipto", "123456", 34);
        c2.setBillAmount(150);
        c2.setHasIssue(true);

        customerList.add(c1);
        customerList.add(c2);
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }
}
