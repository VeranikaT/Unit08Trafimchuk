package com.epam.unit08.task01;

public class Customer {
    private int id;
    private String lastname;
    private String firstname;
    private String patronymic;
    private String address;
    private long card;
    private long account;

    public Customer(int i, String l, String f, String p, String a, long c, long b) {
        id = i;
        lastname = l;
        firstname = f;
        patronymic = p;
        address = a;
        card = c;
        account = b;
    }

    public String toString() {
        return "ID=" + id + ", LastName=\"" + lastname + '\"' + ", FirstName=\"" + firstname + '\"' + ", Patronymic=\"" + patronymic + '\"' + ", Address=" + address + ", CreditCard №=" + card + ", Bank Account №=" + account + "\"\n";
    }

    public void print() {// этот метод тут быть не должен
        System.out.println(toString());
    }
    public void setId(int i) {
        id = i;
    }

    public int getId() { return id; }

    public void setLastname(String l) { lastname = l; }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String f) {
        firstname = f;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setPatronymic(String p) {
        patronymic = p;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setCreditCard(long c) {
        card = c;
    }

    public long getCreditCard() {
        return card;
    }

    public void setBankAccount(long b) { account = b; }

    public long getBankAccount() {
        return account;
    }
    
    //equals, hashCode
}
