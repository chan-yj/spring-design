package com.example.demo.spring.bean.dao;

/**
 * 由于没有mapper.xml，现在只是模拟dao的实现
 */
public class IAccountDaoImpl implements IAccountDao{

    @Override
    public void saveAccount() {
        System.out.println("save account....");
    }
}
