package com.bank.User;

import com.bank.Account;

import java.util.ArrayList;
import java.util.List;

public class User {
    private UserIdentity identity;
    private UserInfos infos;

    private List<Account> accounts;

    public User(){
        this.accounts = new ArrayList<Account>();
    }

    public User(String firstName, String lastName, int age, String adress, String phone) {
        this.identity = new UserIdentity(firstName,lastName, age);
        this.infos = new UserInfos(adress,phone);
        this.accounts = new ArrayList<Account>();
    }


    public String infosUser(){
        return identity.readIdentity()+infos.readInfos();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public UserIdentity getIdentity(){
        return this.identity;
    }

    public UserInfos getInfos(){
        return this.infos;
    }
    public Account openAccount(String name){
        Account account = new Account(name);
        this.accounts.add(account);
        return account;
    }

    public void closeAccount(Account account){
        this.accounts.remove(account);
    }

    public void linkAccount(Account account) { this.accounts.add(account);}

    public double sum(){
        return accounts.stream().mapToDouble(i->i.getBalance()).sum();
    }


    public void updateIdentity(String newLastName){
        this.identity.modifyLastName(newLastName);
    }

    public void updateAdress(String newAdress){
        this.infos.setAdress(newAdress);
    }

    public void updatePhone(String newPhone){
        this.infos.setPhone(newPhone);
    }

}
