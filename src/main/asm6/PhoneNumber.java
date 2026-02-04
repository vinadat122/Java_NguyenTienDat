package main.asm6;

import java.util.ArrayList;

public class PhoneNumber {
    private String name;
    private ArrayList<String> phones;

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>(); //ko truyen array ma truyen phan tu
        this.phones.add(phone);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }
    public void addPhone(String phone) {
        if (!phones.contains(phone)) {
            phones.add(phone);
        }
    }
    public void setPhone(String phone) {
        this.phones.add(phone);
    }
}
