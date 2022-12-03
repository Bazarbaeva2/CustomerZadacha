package Customer;

public interface Srevice {
public int age(String name, Customer[]customers);
Customer[]returenCountry(Customer[]customers);
    Customer[]sortCountry(Customer[]customers);
    Customer[]getAllcustomers(Customer[]customers);


    Customer[] similarCountry(String country, Customer[] customers);

    Customer[] sortCountries(Customer[] customers);

    Customer[] showAllCustomers(Customer[] customers);
}
