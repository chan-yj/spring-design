package com.example.demo.design.abstractFactory;

public class SqlServerFactory implements IFacotry{
    @Override
    public IUser createUser() {
        return new SqlServer();
    }
}
