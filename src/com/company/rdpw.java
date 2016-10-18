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
        password();

    }

    private void password()//void means doesn't return nothing
    {
        pw = "";//will change later to random
        String dataBase = "ABCabc!@#123";
        for(int i = 0; i < 8; i++)
        {
            int rd = (int)(Math.random() * dataBase.length());//random always returns btw 0 - 1
            pw = pw + dataBase.substring(rd, (rd+1));
        }

    }

}
