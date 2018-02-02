package com.bank.User;

public class UserInfos {
    private String adress;
    private String phone;

    public UserInfos(String adress, String phone) {
        this.adress = adress;
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String readInfos(){
        return "Adress : "+adress+"/nPhone : "+phone+"/n";
    }
}
