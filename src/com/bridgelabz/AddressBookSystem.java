package com.bridgelabz;

import javax.swing.*;
import java.util.Scanner;

public class AddressBookSystem {

    public static void address() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First Name : ");
        String first_name = scanner.next();

        System.out.println("Enter Your Last Name : ");
        String last_name = scanner.next();

        System.out.println("Enter Your Address : ");
        String address = scanner.next();

        System.out.println("Enter Your City : ");
        String city = scanner.next();

        System.out.println("Enter Your State : ");
        String state = scanner.next();

        System.out.println("Enter Your Zip Code : ");
        String zip_code = scanner.next();

        System.out.println("Enter Your Phone Number : ");
        String phone_number = scanner.next();

        System.out.println("Enter Your Email Id : ");
        String email_id = scanner.next();

        System.out.println("First Name : " + first_name);
        System.out.println("Last Name : " + last_name);
        System.out.println("Address : " + address);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Zip Code : " + zip_code);
        System.out.println("Phone Number : " + phone_number);
        System.out.println("Email Id : " + email_id);

    }

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        address();
    }
}
