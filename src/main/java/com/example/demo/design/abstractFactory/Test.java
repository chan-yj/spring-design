package com.example.demo.design.abstractFactory;

public class Test {

    public static void main(String[] args) {

        SqlServerFactory sqlServerFactory = new SqlServerFactory();
        IFacotry facotry = new SqlServerFactory();

        IUser user = facotry.createUser();
        user.getUser();
    }
}
