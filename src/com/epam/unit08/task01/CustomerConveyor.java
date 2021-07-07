package com.epam.unit08.task01;

import java.util.ArrayList;
import java.util.List;

public class CustomerConveyor {

    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public CustomerConveyor() {
        this.customers = new ArrayList<Customer>();
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(int i) {
        return customers.get(i);
    }

    public void sortCustomers () {
        customers.sort(new ComparatorByLastname());
    }

    public int size() {
        return customers.size();
    }

    public List getCreditCardList(long one, long two) {
        List<Customer> cardList = new ArrayList<Customer>();

        for (Customer customer : customers) {
            if (customer.getCreditCard() > one && customer.getCreditCard() < two) {
                cardList.add(customer);
            }
        }

        return cardList;
    }

}