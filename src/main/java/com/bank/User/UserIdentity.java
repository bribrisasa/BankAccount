package com.bank.User;

public class UserIdentity {
    private String firstName;
    private String lastName;
    private int age;

    public UserIdentity(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public void modifyLastName(String newLastName){
        this.lastName = newLastName;
    }

    public String readIdentity(){
        return "First Name : "+firstName+"/nLast Name : "+lastName+"/nAge : "+age+"/n";
    }

}
