package Com.rental.vehicle;

import Com.rental.customer.Customer;

public interface Rental {
    void rent(Customer customer, int days);
    void returnVehicle();
}