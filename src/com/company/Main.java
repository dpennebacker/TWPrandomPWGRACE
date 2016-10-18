package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        rdpw user = new rdpw(userName);//Creates object

        System.out.println(user.userName);

        System.out.println(user.pw);
    }
}
