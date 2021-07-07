package com.epam.unit08.task01;

public class Main {

    public static void main(String[] args) {
        CustomerConveyor conveyor = new CustomerConveyor();
        conveyor.add(new Customer(1, "King", "Martin", "Martinovich", "USA", 1111222233334444L, 5555666677778888L));
        conveyor.add(new Customer(2, "Windsor", "Elizabeth", "Georgovna", "UK", 2222333344445555L, 4444555566667777L));
        conveyor.add(new Customer(3, "Mercury", "Freddie", "Bomivich", "India", 3333444455556666L, 1111222233334444L));
        conveyor.add(new Customer(4, "Litvinova", "Renata", "Muratovna", "Russia", 4444555566667777L, 2222333344445555L));
        conveyor.add(new Customer(5, "Reno", "Jean", "Huanovich", "France", 5555666677778888L, 3333444455556666L));

        System.out.println("Get sorted list of Customers by Last Name:");
        conveyor.sortCustomers();
        for (int i = 0;i< conveyor.size(); i++) {
            System.out.println("["+conveyor.getCustomer(i).toString()+"]");
        }

        System.out.println("Get list of Customers with chosen diapason of Credit Cards:");
        System.out.println(conveyor.getCreditCardList(2222333344445555L, 4444555566667777L).toString());

    }
}