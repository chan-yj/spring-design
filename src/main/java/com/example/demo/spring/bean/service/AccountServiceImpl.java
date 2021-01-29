package com.example.demo.spring.bean.service;

import com.example.demo.spring.bean.dao.IAccountDao;

/**
 * 账户的业务层实现类
 *
 */
public class AccountServiceImpl implements IAccountService{

    /**
     * AccountServiceImpl依赖dao层
     */
    private IAccountDao accountDao;


    @Override
    public void saveAccount() {
        System.out.println("==================");
        accountDao.saveAccount();
        System.out.println("==================");
    }



    public IAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
