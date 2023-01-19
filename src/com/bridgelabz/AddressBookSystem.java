package com.bridgelabz;

import java.util.Scanner;

public class AddressBookSystem {

    private String FirstName;
    private String LastName;
    private String Address;
    private String City;
    private String State;
    private Long ZipCode;
    private Long PhoneNO;
    private String Email;

    Scanner scanner = new Scanner(System.in);

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        this.State = state;
    }


    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public Long getZipCode() {
        return ZipCode;
    }

    public void setZipCode(Long zipCode) {
        ZipCode = zipCode;
    }

    public Long getPhoneNO() {
        return PhoneNO;
    }

    public void setPhoneNO(Long phoneNO) {
        PhoneNO = phoneNO;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public void display() {
        System.out.println("Enter Your First Name : ");
        setFirstName(scanner.nextLine());

        System.out.println("Enter Your Last Name : ");
        setLastName(scanner.nextLine());

        System.out.println("Enter Your Address : ");
        setAddress(scanner.nextLine());

        System.out.println("Enter Your City : ");
        setCity(scanner.next());

        System.out.println("Enter Your State : ");
        setState(scanner.next());

        System.out.println("Enter Your Zip Code : ");
        setZipCode(scanner.nextLong());

        System.out.println("Enter Your Phone Number : ");
        setPhoneNO(scanner.nextLong());

        System.out.println("Enter Your Email Id : ");
        setEmail(scanner.next());

        System.out.println("First Name:\t" + this.getFirstName());
        System.out.println("Last Name :\t" + this.getLastName());
        System.out.println("Address :\t" + this.getAddress());
        System.out.println("City :\t" + this.getCity());
        System.out.println("State :\t" + this.getState());
        System.out.println("Zip Code :\t" + this.getZipCode());
        System.out.println("Phone Number:\t" + this.getPhoneNO());
        System.out.println("Email Id :\t" + this.getEmail());
    }

    public static void main(String[] args) {

        AddressBookSystem Contact1 = new AddressBookSystem();
        System.out.println("Enter The Details Of Contact1 : ");
        Contact1.display();

        AddressBookSystem Contact2 = new AddressBookSystem();
        System.out.println("Enter The Details Of Contact2 : ");
        Contact2.display();

        AddressBookSystem Contact3 =new AddressBookSystem();
        System.out.println("Enter The Details Of Contact3 : ");
        Contact3.display();
    }
}
