package Customer;

import java.time.LocalDate;

public class Customer implements Srevice {

    private String name;
    private String surname;
    private String country;
    private LocalDate year;
    private String email;

    public Customer(String name, String surname, String country, LocalDate year, String email) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.year = year;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int age(String name,Customer[] customers) {
        int age=0;
        for (Customer c:customers) {
            if (c.getName().equals(name)){
                age=LocalDate.now().getYear()-c.getYear().getYear();
            }


        }
        return age;
    }

    @Override
    public Customer[] getAllcustomers(Customer[] customers) {
        return new Customer[0];
    }

    @Override
    public Customer[] sortCountry(Customer[] customers) {
        return new Customer[0];
    }

    @Override
    public Customer[] returenCountry(Customer[] customers) {
        return new Customer[0];
    }

    @Override
    public Customer[] similarCountry(String country,Customer[] customers) {
        int counter = 0;
        for (Customer customer: customers) {
            if(customer.getCountry().equals(country)){
                counter++;
            }
        }
        Customer[] customers1 = new Customer[counter];
        int index = 0;
        for (Customer customer:customers) {
            if (customer.getCountry().equals(country)) {
                customers1[index++] = customer;
            }
        }
        return customers1;
    }

    @Override
    public Customer[] sortCountries(Customer[] customers) {
        Customer safe;
        for (int i = 0; i < customers.length; i++) {
            for (int j = 1; j < customers.length; j++) {
                if(customers[i].getCountry().compareTo(customers[j].getCountry())>0){
                    safe=customers[j-1];
                    customers[j-1]=customers[j];
                    customers[j]=safe;
                }
            }
        }
        return customers;
    }

    @Override
    public Customer[] showAllCustomers(Customer[] customers) {
        return customers;

    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", email='" + email + '\'' +
                '}';
    }
}
