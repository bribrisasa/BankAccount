package com.bank;

import com.bank.User.User;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<User> clients;

    public Bank() {
        this.clients = new ArrayList<User>();
    }

    public List<User> getAllClients(){
        return this.clients;
    }

    public User newClient(String fname, String lname, int age, String add, String phone){
        User client = new User(fname,lname,age,add,phone);
        this.clients.add(client);
        return client;
    }

    public void addClient(User c){
        this.clients.add(c);
    }

    public void deleteClient(User c){
        this.clients.remove(c);
    }

    public User getClientByName(String name){
        for (User user: this.getAllClients())
              {
            if(user.getIdentity().getLastName() == name) return user;
        }
        return null;
    }

    public void updateIdentity(User client, String newName){

        getClientByName(client.getIdentity().getLastName()).updateIdentity("titi");
    }
}
