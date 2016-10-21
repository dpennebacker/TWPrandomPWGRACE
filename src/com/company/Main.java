package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName = input.nextLine();

        rdpw user = new rdpw(userName);//Creates object

        System.out.println("Thanks " + user.userName + "is now set as your user name and your password is " + user.pw);

        while (true) {

            System.out.println("To login, enter your username");
            String localUser = input.nextLine();
            System.out.println("Password?");
            String localPw = input.nextLine();

            if (localUser.equals(user.userName) && localPw.equals(user.pw)) {
                System.out.println("Welcome to the system!");
                break;
            } else {
                System.out.println("Try again...");
            }
        }

    }
}
