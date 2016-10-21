package com.company;

/**
 * Created by dpennebacker on 10/18/16.
 */
public class rdpw {
    public String userName;
    public String pw;
    public rdpw (String u)
    {

        userName = u;
        pw = password();

    }

    private String password()//void means doesn't return nothing
    {
        pw = "";//will change later to random
        String dataBase = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#1234567890";
        for(int i = 0; i < 32; i++)
        {
            int rd = (int)(Math.random() * dataBase.length());//random always returns btw 0 - 1
            pw = pw + dataBase.substring(rd, (rd+1));
        }
        return pw;

    }

}
